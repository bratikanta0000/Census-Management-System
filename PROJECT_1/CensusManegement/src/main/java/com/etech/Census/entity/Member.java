package com.etech.Census.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "members")
@Data   // <-- ADD THIS
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String relation;
    private String gender;
    private String age;
    private String marital;
    private String language;
    private String education;
    private String employment;
    private String disability;

    @ManyToOne
    @JoinColumn(name = "household_id")
    private Household household;
}
