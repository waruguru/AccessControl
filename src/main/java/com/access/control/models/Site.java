package com.access.control.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Site {
    private long id;
    private String name;
    private String location;

    @ManyToOne
    @JoinColumn(name="institution_id",nullable=false)
    private Institution institution;

    public Site(String name, String location) {
        this.name = name;
        this.location = location;
    }
}
