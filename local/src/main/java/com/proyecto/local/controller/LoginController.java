package com.proyecto.local.controller;

import jakarta.faces.view.ViewScoped;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component("loginController")
@ViewScoped
public class LoginController implements Serializable {

    public String getUserName(){
        Object datoUser = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(datoUser instanceof UserDetails){
            return ((UserDetails)datoUser).getUsername();
        }
        return datoUser.toString();
    }
}
