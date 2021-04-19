package com.code4joe.ecommerce.backend.persistence.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

public class OrderItem {

    @Id
    @GeneratedValue
    private UUID id;


}
