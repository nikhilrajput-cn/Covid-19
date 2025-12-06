package com.Covid.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "country_wise_latest")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CountryWiseLatest {
    @Id
    @Column(name = "Country/Region")
    private String countryRegion;

    @Column(name = "Confirmed")
    private Integer confirmed;

    @Column(name = "Deaths")
    private Integer deaths;

    @Column(name = "Recovered")
    private Integer recovered;

    @Column(name = "Active")
    private Integer active;

    @Column(name = "New cases")
    private Integer newCases;

    @Column(name = "New deaths")
    private Integer newDeaths;

    @Column(name = "New recovered")
    private Integer newRecovered;

    @Column(name = "Deaths / 100 Cases")
    private Double deathsPer100Cases;

    @Column(name = "Recovered / 100 Cases")
    private Double recoveredPer100Cases;

    @Column(name = "Deaths / 100 Recovered")
    private Double deathsPer100Recovered;

    @Column(name = "Confirmed last week")
    private Integer confirmedLastWeek;

    @Column(name = "1 week change")
    private Integer oneWeekChange;

    @Column(name = "1 week % increase")
    private Double oneWeekPercentIncrease;

    @Column(name = "WHO Region")
    private String whoRegion;

    // additional columns (if exist) can be added similarly
}
