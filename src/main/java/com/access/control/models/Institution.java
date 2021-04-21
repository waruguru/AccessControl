package com.access.control.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
public class Institution {
    @Id
    @GeneratedValue
    private long id;
    private String name;//list of the institutions church,estates,schools,hostels.
    @OneToMany(mappedBy = "user")
    List<User> users=new ArrayList<User>();

    @OneToMany(mappedBy = "site")
    List<Site> sites=new ArrayList<Site>();

    public Institution(String name, List<User> users, List<Site> sites) {
        this.name = name;
        this.users = users;
        this.sites = sites;
    }

    public Institution() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

