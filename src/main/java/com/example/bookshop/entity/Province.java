package com.example.bookshop.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "provinces")
public class Province {

    @Id
    int PROVINCE_ID;
    String PROVINCE_CODE;
    String PROVINCE_NAME;

    @OneToMany(mappedBy = "province")
    List<District> districts;
}
