package com.access.control.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
@Entity

public class Institution {
    private long id;
    private List<String> name;//list of the institutions church,estates,schools,hostels.
    @OneToMany(mappedBy = "user")
    List<User> users=new ArrayList<User>();

    @OneToMany(mappedBy = "site")
    List<Site> sites=new ArrayList<Site>();

    public Institution(List<String> name, List<User> users, List<Site> sites) {
        this.name = name;
        this.users = users;
        this.sites = sites;
    }
}

