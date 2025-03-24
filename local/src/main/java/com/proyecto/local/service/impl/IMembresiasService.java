package com.proyecto.local.service.impl;

import com.proyecto.local.model.CatMembresia;
import com.proyecto.local.model.Membresias;
import com.proyecto.local.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IMembresiasService {
    List<Membresias> obtenerListaMembresias();
    Membresias guardarMembresia(Membresias entity, Usuario usuario);
    void EliminarMembresia(Membresias entity, Usuario usuario);
    List<CatMembresia> obtenerListaCatMembresias();
}
