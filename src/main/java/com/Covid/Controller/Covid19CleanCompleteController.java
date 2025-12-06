package com.Covid.Controller;

import com.Covid.Entity.Covid19CleanComplete;
import com.Covid.Entity.CovidCleanId;
import com.Covid.Service.Covid19CleanCompleteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/covid-clean")
public class Covid19CleanCompleteController {
    private final Covid19CleanCompleteService service;
    public Covid19CleanCompleteController(Covid19CleanCompleteService service) { this.service = service; }

    @GetMapping
    public List<Covid19CleanComplete> getAll() { return service.getAll(); }

    // GET by composite id via query params
    @GetMapping("/item")
    public ResponseEntity<?> getById(@RequestParam String provinceState,
                                     @RequestParam String countryRegion,
                                     @RequestParam String date) {
        CovidCleanId id = new CovidCleanId(provinceState, countryRegion, date);
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Covid19CleanComplete create(@RequestBody Covid19CleanComplete body) { return service.save(body); }

    @PutMapping("/item")
    public ResponseEntity<?> update(@RequestParam String provinceState,
                                    @RequestParam String countryRegion,
                                    @RequestParam String date,
                                    @RequestBody Covid19CleanComplete body) {
        CovidCleanId id = new CovidCleanId(provinceState, countryRegion, date);
        return service.getById(id).map(existing -> {
            // ensure id fields set
            body.setProvinceState(provinceState);
            body.setCountryRegion(countryRegion);
            body.setDate(date);
            return ResponseEntity.ok(service.save(body));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/item")
    public ResponseEntity<?> delete(@RequestParam String provinceState,
                                    @RequestParam String countryRegion,
                                    @RequestParam String date) {
        CovidCleanId id = new CovidCleanId(provinceState, countryRegion, date);
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/by-country")
    public List<Covid19CleanComplete> byCountry(@RequestParam String country) { return service.byCountry(country); }

    @GetMapping("/by-date")
    public List<Covid19CleanComplete> byDate(@RequestParam String date) { return service.byDate(date); }
}
