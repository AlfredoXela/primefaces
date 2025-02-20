/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.local.service;

import com.proyecto.local.model.Ruta;
import java.util.List;
import java.util.Map;

/**
 *
 * @author alfre
 */ 
public interface IRutaService {
    List<Ruta> obtenerListaRutas();
    Map<String, List<String>> getRutaRolMapppings();
}
