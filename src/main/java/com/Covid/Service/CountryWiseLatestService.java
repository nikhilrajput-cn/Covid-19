package com.Covid.Service;

import com.Covid.Entity.CountryWiseLatest;
import com.Covid.Repository.CountryWiseLatestRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryWiseLatestService {
    private final CountryWiseLatestRepository repo;

    public CountryWiseLatestService(CountryWiseLatestRepository repo) {
        this.repo = repo;
    }

    public List<CountryWiseLatest> getAll() { return repo.findAll(); }
    public Optional<CountryWiseLatest> getByCountry(String country) { return repo.findById(country); }
    public CountryWiseLatest save(CountryWiseLatest dto) { return repo.save(dto); }
    public void delete(String country) { repo.deleteById(country); }
    public List<CountryWiseLatest> getByRegion(String region) { return repo.findByWhoRegion(region); }
}
