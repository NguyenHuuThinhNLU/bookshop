package com.example.bookshop.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "wards")
public class Ward {
    @Id
    int WARDS_ID;
    String WARDS_NAME;

    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;
}

