package com.code4joe.ecommerce.backend.persistence.domain;

import java.time.LocalDateTime;


public class CartItem extends BaseEntity {


    //create user_id FK

    //create product_details FK

    private Boolean saveForLater;

    private int quantity;

    private LocalDateTime timeAdded;

}
