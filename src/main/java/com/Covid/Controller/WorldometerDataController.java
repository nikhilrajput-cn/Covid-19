package com.Covid.Controller;

import com.Covid.Entity.WorldometerData;
import com.Covid.Service.WorldometerDataService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/worldometer")
//@CrossOrigin(origins = "*")
public class WorldometerDataController {

    private final WorldometerDataService service;

    public WorldometerDataController(WorldometerDataService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorldometerData> getAll() {
        return service.getAll();
    }

    @GetMapping("/{country}")
    public WorldometerData getByCountry(@PathVariable String country) {
        return service.getByCountry(country);
    }

    @GetMapping("/continent/{continent}")
    public List<WorldometerData> getByContinent(@PathVariable String continent) {
        return service.getByContinent(continent);
    }

    @PostMapping
    public WorldometerData add(@RequestBody WorldometerData w) {
        return service.save(w);
    }

    @PutMapping("/{country}")
    public WorldometerData update(@PathVariable String country, @RequestBody WorldometerData w) {
        w.setCountryRegion(country);
        return service.save(w);
    }

    @DeleteMapping("/{country}")
    public void delete(@PathVariable String country) {
        service.delete(country);
    }
}
