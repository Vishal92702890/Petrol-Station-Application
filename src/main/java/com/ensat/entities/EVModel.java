package com.ensat.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name="PETROL_STATION")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class EVModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Integer station_id;
    @Column(name = "NAME")
    private String station_name;
    @Column(name = "PRICE")
    private BigDecimal station_price;
    @Column(name = "ADDRESS")
    private String station_address;
}

