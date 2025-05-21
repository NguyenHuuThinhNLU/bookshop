package com.example.bookshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_statuses")
public class OrderStatus {
    @Id
    int status;
    String statusName;
}
