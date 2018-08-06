package com.mooracle.core;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * We use abstract class to prevent anyone to instantiate this class to create a Base Entity object
 * Developers must extend it if they want to use it.
 * It will invoke runtime error or at leats syntax error while coding if this class were used with new keyword
 * */

@MappedSuperclass // tells JPA That this is mapped superclass-> to be used with other entities!
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //<-auto generated by Spring JPA
    private final Long id; // since it is final it needs to be initialized-> use Constructor for that

    protected BaseEntity() {
        id = null;
    }
}
