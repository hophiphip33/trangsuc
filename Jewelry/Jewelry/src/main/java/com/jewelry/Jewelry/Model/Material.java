package com.jewelry.Jewelry.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "materials")
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String slug;

    @ManyToOne
    @JoinColumn(name = "jewelry_id")
    @JsonIgnore
    private Jewelry jewelry;
}

