/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.local.service.impl;

import com.proyecto.local.model.CatMaquinas;
import com.proyecto.local.model.Usuario;

import java.util.List;

/**
 *
 * @author alfre
 */
public interface ICatMaquinasService {
    public List<CatMaquinas> obtenerListaCatMaquinas();
    public CatMaquinas obtenerCatMaquinas(Integer id);
    public CatMaquinas guardarCatMaquinas(Usuario usuario, CatMaquinas catMaquinas);
    public CatMaquinas actualizarCatMaquinas(Usuario usuario, CatMaquinas catMaquinas);
    public void eliminarMaquina(Usuario usuario, CatMaquinas catMaquinas);
    
}
