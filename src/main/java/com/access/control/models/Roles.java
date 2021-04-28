package com.access.control.models;


import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Roles {
    @OneToMany(targetEntity = User.class, cascade = {CascadeType.PERSIST})
    Set<User> users = new HashSet<>();
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column

    private String name;//admin, supervisor or regular officer.
    @ElementCollection
    @Column
    @CollectionTable(name = "permissions", joinColumns = @JoinColumn(name = "id"))
    private List<String> permissions;
    @Column
    private long userId;


    public Roles(String name, List<String> permissions) {
        this.name = name;

        this.permissions = permissions;
    }

    public Roles() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }
}
