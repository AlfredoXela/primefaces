/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.local.repository;

import com.proyecto.local.model.CatMaquinas;
import com.proyecto.local.model.Membresias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *
 * @author alfre
 */
public interface ICatMaquinasRepository extends JpaRepository<CatMaquinas, Integer>{
    @Query("SELECT c FROM CatMaquinas c WHERE c.idUsuarioElimino IS NULL AND c.fechaElimino IS NULL")
    List<CatMaquinas> obtenerListaCatMaquinas();
}
