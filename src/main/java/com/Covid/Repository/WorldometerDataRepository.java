package com.Covid.Repository;

import com.Covid.Entity.WorldometerData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorldometerDataRepository extends JpaRepository<WorldometerData, String> {

    List<WorldometerData> findByContinent(String continent);
}
