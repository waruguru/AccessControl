package com.access.control.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class Roles {
    @Id
    private long id;
    private String name;//admin, supervisor or regular officer.
    @Column
    private List<String>  permissions;
    private long userId;
    @OneToMany(mappedBy = "user")
    List<User> users=new ArrayList<User>();



    public Roles() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
