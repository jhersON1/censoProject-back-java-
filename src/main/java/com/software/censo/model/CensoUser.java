package com.software.censo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class CensoUser {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String password;
}
