package com.Covid.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "day_wise")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DayWise {
    @Id
    @Column(name = "Date")
    private String date;

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

    @Column(name = "No. of countries")
    private Integer noOfCountries;

    @Column(name = "no_of_countries")
    private Integer no_of_countries;
}
