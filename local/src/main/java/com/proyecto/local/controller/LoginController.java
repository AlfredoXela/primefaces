package com.proyecto.local.controller;

import com.proyecto.local.config.security.UserCredentialsSecurity;
import com.proyecto.local.model.Usuario;
import com.proyecto.local.view.LoginView;
import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.function.Function;

@Component("loginController")
@ViewScoped
public class LoginController implements Serializable {

    private LoginView view;
    @Autowired
    private UserCredentialsSecurity userCredentialsSecurity;

    public LoginView getView() {
        return view;
    }

    @PostConstruct
    public void init() {
        view = new LoginView();
        view.setUsuario(null);
    }

    public String getUserName() {
        Object datoUser = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (datoUser instanceof UserDetails) {
            view.setUsuario(userCredentialsSecurity.findByNombreUsuario(((UserDetails) datoUser).getUsername()));
            return ((UserDetails) datoUser).getUsername();
        }
        return datoUser.toString();
    }

    public void mensajeGuardado() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Información guardada correctamente"));
    }

    public void mensajeEliminado() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Información eliminada correctamente"));
    }
}
