package com.code4joe.ecommerce.backend.persistence.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
public class CartItem {

    @Id
    @GeneratedValue
    private UUID id;

    //create user_id FK

    //create product_details FK

    private Boolean saveForLater;

    private int quantity;

    private LocalDateTime timeAdded;

}
