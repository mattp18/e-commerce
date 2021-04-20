package com.code4joe.ecommerce.backend.persistence.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.MappedSuperclass;
import java.util.UUID;

@Data
@ToString
@EqualsAndHashCode
@MappedSuperclass   //super class to be mapped by Entity classes
public class BaseEntity {

    private UUID id;
}
