package com.Covid.Service;

import com.Covid.Entity.FullGrouped;
import com.Covid.Entity.FullGroupedId;
import com.Covid.Repository.FullGroupedRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FullGroupedService {
    private final FullGroupedRepository repo;
    public FullGroupedService(FullGroupedRepository repo) { this.repo = repo; }

    public List<FullGrouped> getAll() { return repo.findAll(); }
    public Optional<FullGrouped> getById(FullGroupedId id) { return repo.findById(id); }
    public FullGrouped save(FullGrouped e) { return repo.save(e); }
    public void delete(FullGroupedId id) { repo.deleteById(id); }
    public List<FullGrouped> byCountry(String country) { return repo.findByCountryRegion(country); }
    public List<FullGrouped> byDate(String date) { return repo.findByDate(date); }
}
