package com.Covid.Controller;

import com.Covid.Entity.FullGrouped;
import com.Covid.Entity.FullGroupedId;
import com.Covid.Service.FullGroupedService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/full-grouped")
public class FullGroupedController {
    private final FullGroupedService service;
    public FullGroupedController(FullGroupedService service) { this.service = service; }

    @GetMapping
    public List<FullGrouped> getAll() { return service.getAll(); }

    @GetMapping("/item")
    public ResponseEntity<?> getById(@RequestParam String date, @RequestParam("country") String country) {
        FullGroupedId id = new FullGroupedId(date, country);
        return service.getById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public FullGrouped create(@RequestBody FullGrouped body) { return service.save(body); }

    @PutMapping("/item")
    public ResponseEntity<?> update(@RequestParam String date, @RequestParam("country") String country,
                                    @RequestBody FullGrouped body) {
        FullGroupedId id = new FullGroupedId(date, country);
        return service.getById(id).map(existing -> {
            body.setDate(date);
            body.setCountryRegion(country);
            return ResponseEntity.ok(service.save(body));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/item")
    public ResponseEntity<?> delete(@RequestParam String date, @RequestParam("country") String country) {
        FullGroupedId id = new FullGroupedId(date, country);
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/by-country")
    public List<FullGrouped> byCountry(@RequestParam String country) { return service.byCountry(country); }

    @GetMapping("/by-date")
    public List<FullGrouped> byDate(@RequestParam String date) { return service.byDate(date); }
}
