package com.Covid.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "full_grouped")
@IdClass(FullGroupedId.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FullGrouped {
    @Id
    @Column(name = "Date")
    private String date;

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

    @Column(name = "WHO Region")
    private String whoRegion;
}
