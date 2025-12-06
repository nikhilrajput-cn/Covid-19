package com.Covid.Controller;

import com.Covid.Entity.DayWise;
import com.Covid.Service.DayWiseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/day-wise")
public class DayWiseController {
    private final DayWiseService service;
    public DayWiseController(DayWiseService service) { this.service = service; }

    @GetMapping
    public List<DayWise> getAll() { return service.getAll(); }

    @GetMapping("/{date}")
    public ResponseEntity<?> getByDate(@PathVariable String date) {
        return service.getByDate(date).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public DayWise create(@RequestBody DayWise body) { return service.save(body); }

    @PutMapping("/{date}")
    public ResponseEntity<?> update(@PathVariable String date, @RequestBody DayWise body) {
        return service.getByDate(date).map(existing -> {
            body.setDate(date);
            return ResponseEntity.ok(service.save(body));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{date}")
    public ResponseEntity<?> delete(@PathVariable String date) {
        service.delete(date);
        return ResponseEntity.noContent().build();
    }
}
