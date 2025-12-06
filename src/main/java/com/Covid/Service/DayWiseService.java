package com.Covid.Service;

import com.Covid.Entity.DayWise;
import com.Covid.Repository.DayWiseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DayWiseService {
    private final DayWiseRepository repo;
    public DayWiseService(DayWiseRepository repo) { this.repo = repo; }

    public List<DayWise> getAll() { return repo.findAll(); }
    public Optional<DayWise> getByDate(String date) { return repo.findById(date); }
    public DayWise save(DayWise dto) { return repo.save(dto); }
    public void delete(String date) { repo.deleteById(date); }
}
