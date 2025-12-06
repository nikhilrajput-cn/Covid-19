package com.Covid.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usa_county_wise")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsaCountyWise {
    @Id
    @Column(name = "uid")
    private Long uid;

    @Column(name = "iso2")
    private String iso2;

    @Column(name = "iso3")
    private String iso3;

    @Column(name = "code3")
    private Integer code3;

    @Column(name = "fips")
    private Integer fips;

    @Column(name = "Admin2")
    private String admin2;

    @Column(name = "Province_State")
    private String provinceState;

    @Column(name = "Country_Region")
    private String countryRegion;

    @Column(name = "Lat")
    private Double lat;

    @Column(name = "Long_")
    private Double lon;

    @Column(name = "Combined_Key")
    private String combinedKey;

    @Column(name = "Date")
    private String date;

    @Column(name = "Confirmed")
    private Integer confirmed;

    @Column(name = "Deaths")
    private Integer deaths;
}
