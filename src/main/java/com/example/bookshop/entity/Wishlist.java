package com.example.bookshop.entity;


import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "wishlists")
public class Wishlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    Book book;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    Timestamp createdAt;

}
