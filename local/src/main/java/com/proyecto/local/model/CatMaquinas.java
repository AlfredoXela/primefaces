/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.local.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author alfre
 */

@Entity
@Table(name = "cat_maquinas")
public class CatMaquinas implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "modelo")
    private String modelo;
    
    @Column(name = "fecha_adquisicion")
    private LocalDate fechaAdquisicion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_registro")
    private Date fechaRegistro;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modifico")
    private Date fechaModifico;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_elimino")
    private Date fechaElimino;

    @Column(name = "id_usuario_elimino")
    private Integer idUsuarioElimino;

    @Column(name = "id_usuario_modifico")
    private Integer idUsuarioModifico;

    @Column(name = "id_usuario_registro")
    private Integer idUsuarioRegistro;

    public CatMaquinas() {
    }
    
    public CatMaquinas(Integer id, String nombre, String descripcion, String modelo, LocalDate fechaAdquisicion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.modelo = modelo;
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaModifico() {
        return fechaModifico;
    }

    public void setFechaModifico(Date fechaModifico) {
        this.fechaModifico = fechaModifico;
    }

    public Date getFechaElimino() {
        return fechaElimino;
    }

    public void setFechaElimino(Date fechaElimino) {
        this.fechaElimino = fechaElimino;
    }

    public Integer getIdUsuarioElimino() {
        return idUsuarioElimino;
    }

    public void setIdUsuarioElimino(Integer idUsuarioElimino) {
        this.idUsuarioElimino = idUsuarioElimino;
    }

    public Integer getIdUsuarioModifico() {
        return idUsuarioModifico;
    }

    public void setIdUsuarioModifico(Integer idUsuarioModifico) {
        this.idUsuarioModifico = idUsuarioModifico;
    }

    public Integer getIdUsuarioRegistro() {
        return idUsuarioRegistro;
    }

    public void setIdUsuarioRegistro(Integer idUsuarioRegistro) {
        this.idUsuarioRegistro = idUsuarioRegistro;
    }
}
