package com.access.control.models;

import jdk.jfr.DataAmount;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Roles {
    private long id;
    private String name;//admin, supervisor or regular officer.
    private List<String>  permissions;
    private long userId;
    @OneToMany(mappedBy = "user")
    List<User> users=new ArrayList<User>();

    public Roles(String name, List<String> permissions) {
        this.name = name;
        this.permissions = permissions;
    }
}
