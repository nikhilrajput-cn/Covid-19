package com.Covid.Repository;

import com.Covid.Entity.CountryWiseLatest;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CountryWiseLatestRepository extends JpaRepository<CountryWiseLatest, String> {
    List<CountryWiseLatest> findByWhoRegion(String whoRegion);
}
