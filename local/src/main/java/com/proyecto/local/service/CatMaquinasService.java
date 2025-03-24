/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.local.service;

import com.proyecto.local.model.CatMaquinas;
import com.proyecto.local.repository.ICatMaquinasRepository;
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
        return iCatMaquinasRepository.findAll();
    }

    @Override
    public CatMaquinas obtenerCatMaquinas(Integer id) {
        return iCatMaquinasRepository.findById(id).orElse(null);
    }

    @Override
    public CatMaquinas guardarCatMaquinas(CatMaquinas catMaquinas) {
        return iCatMaquinasRepository.save(catMaquinas);
    }

    @Override
    public void eliminarMaquina(Integer id) {
        iCatMaquinasRepository.deleteById(id);
    }

    @Override
    public CatMaquinas actualizarCatMaquinas(CatMaquinas catMaquinas) {
        return this.guardarCatMaquinas(catMaquinas);
    }
    
}
