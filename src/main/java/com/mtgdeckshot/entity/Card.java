package com.mtgdeckshot.entity;

import javax.persistence.*;

@Entity
@Table(name="cards")
public class Card {

    private int id;
    private String name;

    public Card() {
        this.name = "";
    }

    public Card(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) { this.id = id; }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
