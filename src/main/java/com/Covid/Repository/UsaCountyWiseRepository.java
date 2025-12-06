package com.Covid.Repository;

import com.Covid.Entity.UsaCountyWise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsaCountyWiseRepository extends JpaRepository<UsaCountyWise, Long> {
    List<UsaCountyWise> findByProvinceState(String provinceState);
    List<UsaCountyWise> findByCountryRegion(String countryRegion);
    List<UsaCountyWise> findByDate(String date);
}
