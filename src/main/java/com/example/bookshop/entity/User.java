package com.example.bookshop.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;
import java.util.List;

@Data
@Entity
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String phoneNumber;
    int gender;
    String role;
    Timestamp createdAt;
    String email;
    String fullName;
    String username;
    String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    List<Address> addresses;

    @OneToMany(mappedBy = "user")
    List<Order> orders;

    @OneToMany(mappedBy = "user")
    List<Wishlist> wishlists;


}
