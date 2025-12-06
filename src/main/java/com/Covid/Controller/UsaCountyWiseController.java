package com.Covid.Controller;

import com.Covid.Entity.UsaCountyWise;
import com.Covid.Service.UsaCountyWiseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usa-county-wise")
public class UsaCountyWiseController {
    private final UsaCountyWiseService service;
    public UsaCountyWiseController(UsaCountyWiseService service) { this.service = service; }

    @GetMapping
    public List<UsaCountyWise> getAll() { return service.getAll(); }

    @GetMapping("/{uid}")
    public ResponseEntity<?> getById(@PathVariable Long uid) {
        return service.getById(uid).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public UsaCountyWise create(@RequestBody UsaCountyWise body) { return service.save(body); }

    @PutMapping("/{uid}")
    public ResponseEntity<?> update(@PathVariable Long uid, @RequestBody UsaCountyWise body) {
        return service.getById(uid).map(existing -> {
            body.setUid(uid);
            return ResponseEntity.ok(service.save(body));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{uid}")
    public ResponseEntity<?> delete(@PathVariable Long uid) {
        service.delete(uid);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/by-state")
    public List<UsaCountyWise> byState(@RequestParam String state) { return service.byState(state); }

    @GetMapping("/by-date")
    public List<UsaCountyWise> byDate(@RequestParam String date) { return service.byDate(date); }
}
