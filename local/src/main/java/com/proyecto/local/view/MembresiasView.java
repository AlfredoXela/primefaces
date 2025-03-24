package com.proyecto.local.view;

import com.proyecto.local.model.CatMembresia;
import com.proyecto.local.model.Membresias;

import java.util.List;

public class MembresiasView {

    Membresias entity;
    List<Membresias> listaEntity;
    List<CatMembresia> listaMembresias;

    public Membresias getEntity() {
        return entity;
    }

    public void setEntity(Membresias entity) {
        this.entity = entity;
    }

    public List<Membresias> getListaEntity() {
        return listaEntity;
    }

    public void setListaEntity(List<Membresias> listaEntity) {
        this.listaEntity = listaEntity;
    }

    public List<CatMembresia> getListaMembresias() {
        return listaMembresias;
    }

    public void setListaMembresias(List<CatMembresia> listaMembresias) {
        this.listaMembresias = listaMembresias;
    }
}
