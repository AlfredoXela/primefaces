package com.proyecto.local.model;

import jakarta.persistence.*;

@Entity
@Table(name = "imagenes")
public class Imagenes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "url")
    private String url;

    @Column(name = "nombre_archivo")
    private String nombreArchivo;
}
