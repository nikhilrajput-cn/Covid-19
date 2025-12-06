package com.Covid.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "worldometer_data")
public class WorldometerData {

    @Id
    @Column(name = "`Country/Region`")
    private String countryRegion;

    @Column(name = "`Continent`")
    private String continent;

    @Column(name = "`population`")
    private Long population;

    @Column(name = "`TotalCases`")
    private Integer totalCases;

    @Column(name = "`NewCases`")
    private Integer newCases;

    @Column(name = "`TotalDeaths`")
    private Integer totalDeaths;

    @Column(name = "`NewDeaths`")
    private Integer newDeaths;

    @Column(name = "`TotalRecovered`")
    private Integer totalRecovered;

    @Column(name = "`NewRecovered`")
    private Integer newRecovered;

    @Column(name = "`ActiveCases`")
    private Integer activeCases;

    @Column(name = "`serious,critical`")
    private Integer seriousCritical;

    @Column(name = "`tot cases/1m pop`")
    private Double casesPerMillion;

    @Column(name = "`deaths/1m pop`")
    private Double deathsPerMillion;

    @Column(name = "`TotalTests`")
    private Integer totalTests;

    @Column(name = "`tests/1m pop`")
    private Double testsPerMillion;

    @Column(name = "`WHO Region`")
    private String whoRegion;
}
