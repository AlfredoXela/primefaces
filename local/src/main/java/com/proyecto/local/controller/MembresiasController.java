package com.proyecto.local.controller;

import com.proyecto.local.model.Membresias;
import com.proyecto.local.repository.IUsuarioRepository;
import com.proyecto.local.service.impl.IMembresiasService;
import com.proyecto.local.view.MembresiasView;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.io.Serializable;

@ViewScoped
@Component(value = "membresiasController")
public class MembresiasController implements Serializable {

    private MembresiasView view;

    @Autowired
    private LoginController session;

    @Autowired
    private IMembresiasService membresiasService;

    @PostConstruct
    public void init() {
        view = new MembresiasView();
        mostrarLista();
    }

    public MembresiasView getView() {
        return view;
    }

    public void mostrarLista() {
        view.setEntity(null);
        view.setListaMembresias(null);
        view.setListaEntity(membresiasService.obtenerListaMembresias());
    }


    public void guardarMembresias() {
        view.setEntity(membresiasService.guardarMembresia(view.getEntity(), session.getView().getUsuario()));
        mostrarLista();
    }

    public void nuevo() {
        view.setListaEntity(null);
        view.setEntity(new Membresias());
        view.setListaMembresias(membresiasService.obtenerListaCatMembresias());
    }

    public void editarMembresias(Membresias entity) {
        view.setListaEntity(null);
        view.setEntity(entity);
        view.setListaMembresias(membresiasService.obtenerListaCatMembresias());
    }

    public void eliminarMembresias(Membresias entity) {
        membresiasService.EliminarMembresia(entity, session.getView().getUsuario());
        mostrarLista();
    }


}
