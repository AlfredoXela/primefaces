/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.local.view;

import com.proyecto.local.model.CatMaquinas;
import java.util.List;

/**
 *
 * @author alfre
 */
public class CatMaquinasView {
    private List<CatMaquinas> listaCatMaquinas;
    private CatMaquinas catMaquinas;

    public List<CatMaquinas> getListaCatMaquinas() {
        return listaCatMaquinas;
    }

    public void setListaCatMaquinas(List<CatMaquinas> listaCatMaquinas) {
        this.listaCatMaquinas = listaCatMaquinas;
    }

    public CatMaquinas getCatMaquinas() {
        return catMaquinas;
    }

    public void setCatMaquinas(CatMaquinas catMaquinas) {
        this.catMaquinas = catMaquinas;
    }
    
}
