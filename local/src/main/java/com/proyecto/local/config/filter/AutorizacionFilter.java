/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.local.config.filter;

import com.proyecto.local.service.IRutaService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 *
 * @author alfre
 */

@Component
public class AutorizacionFilter extends OncePerRequestFilter{
    @Autowired
    private IRutaService iRutaService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String requesURI = request.getRequestURI();
         
        Map<String,List<String>> mapaRutas = iRutaService.getRutaRolMapppings();
        
        List<String> authRoles = mapaRutas.get(requesURI);
        if(authRoles != null) {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            if(authentication != null && authentication.isAuthenticated()) {
                boolean accesoRol = authentication.getAuthorities().stream()
                        .anyMatch(grantedAuthority -> authRoles.contains(grantedAuthority.getAuthority()));
                
                if(!accesoRol){
                    request.getRequestDispatcher("/403.xhtml").forward(request, response);
                    return;
                }
            }
        }
        filterChain.doFilter(request, response);
    }
    
}
