package com.example.bookshop.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Entity
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "districts")
public class District {
    @Id
     int DISTRICT_ID;
     String DISTRICT_VALUE;
     String DISTRICT_NAME;

    @ManyToOne
    @JoinColumn(name = "province_id")
     Province province;

    @OneToMany(mappedBy = "district")
     List<Ward> wards;
}
