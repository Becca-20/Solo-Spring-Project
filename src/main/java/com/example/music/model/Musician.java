package com.example.music.model;

import javax.persistence.*;

@Entity
@Table(name = "musicians")
public class Musician {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private int contactReference;

    @Column
    private String instrument;

    @Column
    private int grade;

    @ManyToOne
    @JoinColumn(name = "concert_id", nullable = false)
    private Concert concert;

    // no arg constructor
    public Musician() {
    }

    // arg constructor
    public Musician (String name, int contactReference, String instrument, int grade) {
        this.id = null;
        this.name = name;
        this.contactReference = contactReference;
        this.instrument = instrument;
        this.grade = grade;
    }

    // getters + setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return contactReference;
    }

    public void setNumber(int number) {
        this.contactReference = number;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
