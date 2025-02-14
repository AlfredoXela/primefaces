/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.local.handler;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author alfre
 */
@Controller
public class Custom404 implements ErrorController{
    
    @RequestMapping("/error")
    public String getErrorPath() {
        return "/404.xhtml";
    }
    
}
