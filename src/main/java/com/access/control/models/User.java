package com.access.control.models;

import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
    private String userLevel;
    private String city;
    private String address;
    private String town;
    private String gender;
    private String age;

    @ManyToOne(fetch = FetchType.LAZY )
    @JoinColumn(name="role_id",nullable=false)
    private Roles role;

    @ManyToOne
    @JoinColumn(name="institution_id",nullable=false)
    private Institution institution;

    public User(String firstName, String lastName, String email, String phoneNumber, String password, String userLevel, String city, String address, String town, String gender, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userLevel = userLevel;
        this.city = city;
        this.address = address;
        this.town = town;
        this.gender = gender;
        this.age = age;
    }
}
