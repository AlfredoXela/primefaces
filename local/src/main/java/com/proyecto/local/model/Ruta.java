/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.local.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Set;

/**
 *
 * @author alfre
 */
@Entity
@Table(name = "ruta")
public class Ruta implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "ruta_url")
    private String rutaURL;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "ruta_as_rol",
            joinColumns = @JoinColumn(name = "id_ruta"),
            inverseJoinColumns = @JoinColumn(name = "id_rol")
    )
    private Set<Rol> roles;

    public Ruta() {
    }

    public Ruta(Integer id, String rutaURL, Set<Rol> roles) {
        this.id = id;
        this.rutaURL = rutaURL;
        this.roles = roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRutaURL() {
        return rutaURL;
    }

    public void setRutaURL(String rutaURL) {
        this.rutaURL = rutaURL;
    }

    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }
    
    
}
