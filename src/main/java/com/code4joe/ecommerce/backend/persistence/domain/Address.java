package com.code4joe.ecommerce.backend.persistence.domain;

import javax.persistence.*;


public class Address extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String fullName;

    private String address1;

    private String postcode;

    private String city;

    private String number;


}
