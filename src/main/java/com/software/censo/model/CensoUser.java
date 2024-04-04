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
    @ManyToOne(optional = true)
    @JoinColumn(name = "creado_por")
    public CensoUser creadoPor;
    @Enumerated(EnumType.STRING)
    public TipoRol roles;


    public enum TipoRol {
        ADMINISTRADOR,
        CENSADOR,
        USUARIO
    }
}
