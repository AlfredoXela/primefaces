/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.local.service;

import com.proyecto.local.model.Ruta;
import com.proyecto.local.repository.IRutaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alfre
 */

@Service
public class RutaService implements IRutaService{
    
    @Autowired
    private IRutaRepository iRutaRepository;

    @Override
    public List<Ruta> obtenerListaRutas() {
        return iRutaRepository.findAll();
    }
    
}
