package com.coursework.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "stations")
public class Station implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    @Column(name = "head_chair")
    private String headChair;
}