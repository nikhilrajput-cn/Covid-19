package com.Covid.Controller;

import com.Covid.Entity.CountryWiseLatest;
import com.Covid.Service.CountryWiseLatestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/country-wise-latest")
public class CountryWiseLatestController {
    private final CountryWiseLatestService service;
    public CountryWiseLatestController(CountryWiseLatestService service) { this.service = service; }

    @GetMapping
    public List<CountryWiseLatest> getAll() { return service.getAll(); }

    @GetMapping("/{country}")
    public ResponseEntity<?> getByCountry(@PathVariable String country) {
        return service.getByCountry(country)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public CountryWiseLatest create(@RequestBody CountryWiseLatest body) { return service.save(body); }

    @PutMapping("/{country}")
    public ResponseEntity<?> update(@PathVariable String country, @RequestBody CountryWiseLatest body) {
        return service.getByCountry(country).map(existing -> {
            body.setCountryRegion(country);
            return ResponseEntity.ok(service.save(body));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{country}")
    public ResponseEntity<?> delete(@PathVariable String country) {
        service.delete(country);
        return ResponseEntity.noContent().build();
    }

    // filter by WHO region
    @GetMapping("/region")
    public List<CountryWiseLatest> byRegion(@RequestParam String whoRegion) {
        return service.getByRegion(whoRegion);
    }
}
