package com.etech.Census.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "household")
@Data
public class Household {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  
    @Column(name = "household_id", unique = true)
    private String householdId;
    
    @Column(name = "head_name")
    private String headName;
    private String aadharno;
    private String age;

    private String state;
    private String district;
    private String subdistrict;
    private String villageTown;
    private String wardBlock;
    private String pincode;
    private String houseNo;
    private String street;

    private String houseType;
    private String ownership;
    private String numRooms;
    private String toiletType;
    private String waterSource;
    private String electricity;
    private String kitchen;
    private String cookingFuel;

    private String fridge;
    private String tv;
    private String internet;
    private String vehicle;

    @OneToMany(mappedBy = "household", cascade = CascadeType.ALL)
    private List<Member> members;
}
