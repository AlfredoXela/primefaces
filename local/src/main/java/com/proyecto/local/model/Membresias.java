package com.proyecto.local.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "membresias")
public class Membresias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_usuario_registro")
    private Integer idUsuarioRegistro;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_registro")
    private Date fechaRegistro;

    @Column(name = "id_usuario_modifico")
    private Integer idUsuarioModifico;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modifico")
    private Date fechaModifico;

    @Column(name = "id_usuario_elimino")
    private Integer idUsuarioElimino;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_elimino")
    private Date fechaElimino;

    @Column(name = "nombre_cliente")
    private String nombreCliente;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_cat_membresia", referencedColumnName = "id")
    private CatMembresia catMembresia;

    @Column(name = "duracion_meses")
    private Integer duracionMeses;

    @Column(name = "total_Pago")
    private BigDecimal totalPago;

    @Column(name = "activo")
    private Boolean activo;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_inicio_vigencia")
    private Date fechaInicioVigencia;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_fin_vigencia")
    private Date fechaFinVigencia;

    public Membresias() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuarioRegistro() {
        return idUsuarioRegistro;
    }

    public void setIdUsuarioRegistro(Integer idUsuarioRegistro) {
        this.idUsuarioRegistro = idUsuarioRegistro;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdUsuarioModifico() {
        return idUsuarioModifico;
    }

    public void setIdUsuarioModifico(Integer idUsuarioModifico) {
        this.idUsuarioModifico = idUsuarioModifico;
    }

    public Date getFechaModifico() {
        return fechaModifico;
    }

    public void setFechaModifico(Date fechaModifico) {
        this.fechaModifico = fechaModifico;
    }

    public Integer getIdUsuarioElimino() {
        return idUsuarioElimino;
    }

    public void setIdUsuarioElimino(Integer idUsuarioElimino) {
        this.idUsuarioElimino = idUsuarioElimino;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Date getFechaElimino() {
        return fechaElimino;
    }

    public void setFechaElimino(Date fechaElimino) {
        this.fechaElimino = fechaElimino;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CatMembresia getCatMembresia() {
        return catMembresia;
    }

    public void setCatMembresia(CatMembresia catMembresia) {
        this.catMembresia = catMembresia;
    }

    public Integer getDuracionMeses() {
        return duracionMeses;
    }

    public void setDuracionMeses(Integer duracionMeses) {
        this.duracionMeses = duracionMeses;
    }

    public BigDecimal getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(BigDecimal totalPago) {
        this.totalPago = totalPago;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Date getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(Date fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    @Override
    public String toString() {
        return "Membresias{" +"id=" + id + '}';
    }
}
