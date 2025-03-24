package com.proyecto.local.service;

import com.proyecto.local.model.CatMembresia;
import com.proyecto.local.model.Membresias;
import com.proyecto.local.model.Usuario;
import com.proyecto.local.repository.ICatMembresiaRepository;
import com.proyecto.local.repository.IMembresiasRepository;
import com.proyecto.local.service.impl.IMembresiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MembresiasService implements IMembresiasService {
    @Autowired
    IMembresiasRepository membresiasRepository;

    @Autowired
    ICatMembresiaRepository catMembresiaRepository;

    public List<Membresias> obtenerListaMembresias() {
        return membresiasRepository.obtenerActivas();
    }

    public Membresias guardarMembresia(Membresias entity, Usuario usuario) {
        if (entity.getId() == null) {
            entity.setIdUsuarioRegistro(usuario.getId());
            entity.setFechaRegistro(new Date());
        } else {
            entity.setIdUsuarioModifico(usuario.getId());
            entity.setFechaModifico(new Date());
        }
        return membresiasRepository.save(entity);
    }

    public void EliminarMembresia(Membresias entity, Usuario usuario) {
        entity.setIdUsuarioElimino(usuario.getId());
        entity.setFechaElimino(new Date());
        membresiasRepository.save(entity);
    }

    public List<CatMembresia> obtenerListaCatMembresias() {
        return catMembresiaRepository.findAll();
    }
}
