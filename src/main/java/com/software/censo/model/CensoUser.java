package com.software.censo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class CensoUser {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public UUID id;
    public String name;
    public String lastName;
    public String email;
    public String password;
    public String carnet;
    public String administrator;
    @Enumerated(EnumType.STRING)
    public TipoRol role;
    public enum TipoRol {
        ADMINISTRATOR,
        CENSUS_TAKER
    }
}
