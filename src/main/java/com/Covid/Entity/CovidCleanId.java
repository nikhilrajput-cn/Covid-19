package com.Covid.Entity;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CovidCleanId implements Serializable {
    private String provinceState;
    private String countryRegion;
    private String date;
}
