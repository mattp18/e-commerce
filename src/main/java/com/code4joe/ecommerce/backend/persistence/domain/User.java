package com.code4joe.ecommerce.backend.persistence.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    private UUID id;

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
