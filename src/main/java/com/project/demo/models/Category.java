package com.project.demo.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "categorias")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nombre;

    private String descripcion;

    // Relación inversa: Una categoría tiene muchos productos
    // mappedBy debe coincidir con el nombre del campo en la clase Producto
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private List<Product> productos;
}