package com.code4joe.ecommerce.backend.persistence.domain;

import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.Set;


public class User extends BaseEntity {


    private  String email;

    private String name;

    private String dateOfBirth;

    private String phone;

    private String password;

    private LocalDateTime dateJoined;

    private LocalDateTime modified;

    private int type;

    private Boolean deleted;

    @OneToMany(mappedBy = "user")
    private Set<Address> addresses;




}
