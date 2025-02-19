/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.local.config.security;

import com.proyecto.local.model.Usuario;
import com.proyecto.local.repository.IUsuarioRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author alfre
 */

@Service
public class UserCredentialsSecurity implements UserDetailsService{

    @Autowired
    private IUsuarioRepository iUsuarioRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = iUsuarioRepository.findByNombreUsuario(username).orElse(null);
        
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>(); 
        if(usuario != null){
            grantedAuthorities = usuario.getRoles().stream()
                    .map(rol -> new SimpleGrantedAuthority(rol.getNombre()))
                    .collect(Collectors.toList());
        }
        
        return new User(
                usuario.getNombreUsuario(),
                usuario.getContrasena(),
                usuario.isEstado(),
                true,
                true,
                true, 
                grantedAuthorities
        );
    }
    
}
