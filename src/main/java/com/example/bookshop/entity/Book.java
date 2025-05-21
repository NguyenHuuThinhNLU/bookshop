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
@Table(name = "Books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
    double price;
    double discount;
    long quantity;
    String imageName;
    String author;
    String publisher;
    int yearPublishing;
    int shop;

    @Column(columnDefinition = "TEXT")
    String description;

    Timestamp createdAt;
    Timestamp updatedAt;
    Timestamp endsAt;

    @OneToMany(mappedBy = "book")
    List<Wishlist> wishlists;

    @OneToMany(mappedBy = "product")
    List<OrderItem> orderItems;
}
