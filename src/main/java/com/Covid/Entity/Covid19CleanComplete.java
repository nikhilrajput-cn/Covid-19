package com.Covid.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "covid_19_clean_complete")
@IdClass(CovidCleanId.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Covid19CleanComplete {

    @Id
    @Column(name = "Province/State")
    private String provinceState;

    @Id
    @Column(name = "Country/Region")
    private String countryRegion;

    @Id
    @Column(name = "Date")
    private String date;

    @Column(name = "Lat")
    private Double lat;

    @Column(name = "Long")
    private Double lon;

    @Column(name = "Confirmed")
    private Integer confirmed;

    @Column(name = "Deaths")
    private Integer deaths;

    @Column(name = "Recovered")
    private Integer recovered;

    @Column(name = "Active")
    private Integer active;

    @Column(name = "WHO Region")
    private String whoRegion;
}
