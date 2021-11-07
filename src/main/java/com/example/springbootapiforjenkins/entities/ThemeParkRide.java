package com.example.springbootapiforjenkins.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "theme_park_rides")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ThemeParkRide {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String description;
    private int thrillFactor;
    private int vomitFactor;

    public ThemeParkRide(String name, String description, int thrillFactor, int vomitFactor) {
        this.name = name;
        this.description = description;
        this.thrillFactor = thrillFactor;
        this.vomitFactor = vomitFactor;
    }
}
