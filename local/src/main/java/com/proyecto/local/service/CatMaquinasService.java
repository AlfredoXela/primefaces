/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.local.service;

import com.proyecto.local.model.CatMaquinas;
import com.proyecto.local.model.Usuario;
import com.proyecto.local.repository.ICatMaquinasRepository;

import java.util.Date;
import java.util.List;

import com.proyecto.local.service.impl.ICatMaquinasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alfre
 */
@Service
public class CatMaquinasService implements ICatMaquinasService {
    
    @Autowired
    private ICatMaquinasRepository iCatMaquinasRepository;
    
    @Override
    public List<CatMaquinas> obtenerListaCatMaquinas() {
        return iCatMaquinasRepository.obtenerListaCatMaquinas();
    }

    @Override
    public CatMaquinas obtenerCatMaquinas(Integer id) {
        return iCatMaquinasRepository.findById(id).orElse(null);
    }

    @Override
    public CatMaquinas guardarCatMaquinas(Usuario usuario, CatMaquinas catMaquinas) {
        if(catMaquinas.getId() == null) {
            catMaquinas.setIdUsuarioRegistro(usuario.getId());
            catMaquinas.setFechaRegistro(new Date());
        }else {
            catMaquinas.setIdUsuarioModifico(usuario.getId());
            catMaquinas.setFechaModifico(new Date());
        }
        return iCatMaquinasRepository.save(catMaquinas);
    }

    @Override
    public void eliminarMaquina(Usuario usuario, CatMaquinas catMaquinas) {
        catMaquinas.setIdUsuarioElimino(usuario.getId());
        catMaquinas.setFechaElimino(new Date());
        iCatMaquinasRepository.save(catMaquinas);
    }

    @Override
    public CatMaquinas actualizarCatMaquinas(Usuario usuario,CatMaquinas catMaquinas) {
        return this.guardarCatMaquinas(usuario, catMaquinas);
    }
    
}
