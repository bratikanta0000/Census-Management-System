package com.etech.Census.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "admin_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fullName;
    private String adminid;
    private String password;
    private String adminDesignation;
    private String state;
    private String district;
}
