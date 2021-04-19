package com.code4joe.ecommerce.backend.persistence.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Address {

    @Id
    @GeneratedValue
    private UUID id;


    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String fullName;

    private String address1;

    private String postcode;

    private String city;

    private String number;


}
