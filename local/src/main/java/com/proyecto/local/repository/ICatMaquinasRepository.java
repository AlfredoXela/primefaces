/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.local.repository;

import com.proyecto.local.model.CatMaquinas;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author alfre
 */
public interface ICatMaquinasRepository extends JpaRepository<CatMaquinas, Integer>{
    
}
