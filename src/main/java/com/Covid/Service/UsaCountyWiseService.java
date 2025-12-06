package com.Covid.Service;

import com.Covid.Entity.UsaCountyWise;
import com.Covid.Repository.UsaCountyWiseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsaCountyWiseService {
    private final UsaCountyWiseRepository repo;
    public UsaCountyWiseService(UsaCountyWiseRepository repo) { this.repo = repo; }

    public List<UsaCountyWise> getAll() { return repo.findAll(); }
    public Optional<UsaCountyWise> getById(Long uid) { return repo.findById(uid); }
    public UsaCountyWise save(UsaCountyWise e) { return repo.save(e); }
    public void delete(Long uid) { repo.deleteById(uid); }
    public List<UsaCountyWise> byState(String state) { return repo.findByProvinceState(state); }
    public List<UsaCountyWise> byDate(String date) { return repo.findByDate(date); }
}
