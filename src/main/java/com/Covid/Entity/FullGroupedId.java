package com.Covid.Entity;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class FullGroupedId implements Serializable {
    private String date;
    private String countryRegion;
}
