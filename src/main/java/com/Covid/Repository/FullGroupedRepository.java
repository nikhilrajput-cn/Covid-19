package com.Covid.Repository;

import com.Covid.Entity.FullGrouped;
import com.Covid.Entity.FullGroupedId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FullGroupedRepository extends JpaRepository<FullGrouped, FullGroupedId> {
    List<FullGrouped> findByCountryRegion(String countryRegion);
    List<FullGrouped> findByDate(String date);
}
