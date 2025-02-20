/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.local.service;

import com.proyecto.local.model.Rol;
import com.proyecto.local.model.Ruta;
import com.proyecto.local.repository.IRutaRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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
    
    @Override
    public Map<String, List<String>> getRutaRolMapppings(){
        Map<String, List<String>> map = new HashMap<>();
        List<Ruta> rutas = obtenerListaRutas();
        
        for (Ruta ruta : rutas){
            if(!ruta.getRoles().isEmpty()){
                List<String> roles = ruta.getRoles().stream()
                        .map(Rol::getNombre)
                        .collect(Collectors.toList());
                map.put(ruta.getRutaURL(), roles);
            }
        }
        return map;
    }
}
