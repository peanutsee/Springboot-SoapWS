package com.soapws.soapws.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "COUNTRIES")
@Getter
@Setter
@NoArgsConstructor
public class CountryEntity {
    @Id
    @Column(name = "NAME")
    private String name;

    @Column(name = "POPULATION")
    private int population;

    @Column(name = "CAPITAL")
    private String capital;

    @Column(name = "CURRENCY")
    private String currency;
}
