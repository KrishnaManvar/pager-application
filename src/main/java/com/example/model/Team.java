package com.example.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Team {

    @Id
    private String id;
    private String name;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "teamId")
    private List<Developer> developer;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Developer> getDeveloper() {
        return developer;
    }

    public void setDeveloper(List<Developer> developer) {
        this.developer = developer;
    }
}
