package com.prashanthvangari.patientservice.model;
import jakarta.persistence.Entity;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.Auto)
    private UUID id;

}