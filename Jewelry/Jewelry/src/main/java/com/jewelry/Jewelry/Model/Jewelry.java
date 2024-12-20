package com.jewelry.Jewelry.Model;

//import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "jewelries")
public class Jewelry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String slug;

    private Double price;

    private String description;

    @OneToMany(mappedBy = "jewelry", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Image> images; // Mối quan hệ với Image

    @ManyToMany
    @JoinTable(
            name = "jewelry_categories",
            joinColumns = @JoinColumn(name = "jewelry_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categories;

    @ManyToMany
    @JoinTable(
            name = "jewelry_materials",
            joinColumns = @JoinColumn(name = "jewelry_id"),
            inverseJoinColumns = @JoinColumn(name = "material_id")
    )
    private List<Material> materials;



    @OneToMany(mappedBy = "jewelry", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderDetail> orderDetails;

    @OneToMany(mappedBy = "jewelry", cascade = CascadeType.ALL)
    private List<Modified> modified;
}
