package com.proyecto.local.controller;

import com.proyecto.local.repository.IUsuarioRepository;
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

    @PostConstruct
    public void init() {
        view = new MembresiasView();
        mostrarLista();
    }

    public void mostrarLista() {
        view.setNombreMembresias("Lista de Membresias");
    }

    public MembresiasView getView() {
        return view;
    }

    public void guardarMembresias() {

    }


}
