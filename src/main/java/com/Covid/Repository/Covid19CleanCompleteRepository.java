package com.Covid.Repository;

import com.Covid.Entity.Covid19CleanComplete;
import com.Covid.Entity.CovidCleanId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Covid19CleanCompleteRepository extends JpaRepository<Covid19CleanComplete, CovidCleanId> {
    List<Covid19CleanComplete> findByCountryRegion(String countryRegion);
    List<Covid19CleanComplete> findByDate(String date);
}
