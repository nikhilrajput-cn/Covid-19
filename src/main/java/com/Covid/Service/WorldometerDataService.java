package com.Covid.Service;

import com.Covid.Entity.WorldometerData;
import com.Covid.Repository.WorldometerDataRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorldometerDataService {

    private final WorldometerDataRepository repo;

    public WorldometerDataService(WorldometerDataRepository repo) {
        this.repo = repo;
    }

    public List<WorldometerData> getAll() {
        return repo.findAll();
    }

    public WorldometerData getByCountry(String country) {
        return repo.findById(country).orElse(null);
    }

    public List<WorldometerData> getByContinent(String continent) {
        return repo.findByContinent(continent);
    }

    public WorldometerData save(WorldometerData w) {
        return repo.save(w);
    }

    public void delete(String country) {
        repo.deleteById(country);
    }
}
