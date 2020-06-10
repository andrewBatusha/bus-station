package com.coursework.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "routes")
public class Route implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private String departureDate;

    private String destinationDate;

    private String departure;

    private String destination;

    @OneToOne(fetch = FetchType.EAGER, cascade= CascadeType.MERGE)
    @JoinColumn(name = "bus_id")
    private Bus bus;

}