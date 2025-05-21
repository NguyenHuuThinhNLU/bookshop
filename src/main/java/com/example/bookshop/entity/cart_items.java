package com.example.bookshop.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

@Data
@Entity
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cart_items")
public class cart_items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    Long cartId;
    int productId;
    int quantity;
    Timestamp createdAt;
    Timestamp updatedAt;
}
