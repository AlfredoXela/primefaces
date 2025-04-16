/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.local.controller;

import com.proyecto.local.model.CatMaquinas;
import com.proyecto.local.service.impl.ICatMaquinasService;
import com.proyecto.local.view.CatMaquinasView;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author alfre
 */

@ViewScoped
@Component(value = "catMaquinasController")
public class CatMaquinasController implements Serializable{
    private CatMaquinasView view;
    
    @Autowired
    private ICatMaquinasService service;
    
    @PostConstruct
    public void init() {
        view = new CatMaquinasView();
        mostrarLista();
    }

    public CatMaquinasView getView() {
        return view;
    }
    
    public void mostrarLista() {
        view.setListaCatMaquinas(service.obtenerListaCatMaquinas());
        view.setCatMaquinas(null);
    }
    
    public void nuevo(){
        view.setCatMaquinas(new CatMaquinas());
    }

    public void guardar(){
        service.guardarCatMaquinas(view.getCatMaquinas());
        mostrarLista();
    }

    public void editar(CatMaquinas entity){
        view.setCatMaquinas(entity);
        view.setListaCatMaquinas(null);
    }

    public void eliminar(CatMaquinas entity){
        service.eliminarMaquina(entity.getId());
        mostrarLista();
    }
}