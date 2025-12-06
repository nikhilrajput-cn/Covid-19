package com.Covid.Service;

import com.Covid.Entity.Covid19CleanComplete;
import com.Covid.Entity.CovidCleanId;
import com.Covid.Repository.Covid19CleanCompleteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Covid19CleanCompleteService {
    private final Covid19CleanCompleteRepository repo;
    public Covid19CleanCompleteService(Covid19CleanCompleteRepository repo) { this.repo = repo; }

    public List<Covid19CleanComplete> getAll() { return repo.findAll(); }
    public Optional<Covid19CleanComplete> getById(CovidCleanId id) { return repo.findById(id); }
    public Covid19CleanComplete save(Covid19CleanComplete entity) { return repo.save(entity); }
    public void delete(CovidCleanId id) { repo.deleteById(id); }
    public List<Covid19CleanComplete> byCountry(String country) { return repo.findByCountryRegion(country); }
    public List<Covid19CleanComplete> byDate(String date) { return repo.findByDate(date); }
}
