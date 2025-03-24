package com.proyecto.local.repository;

import com.proyecto.local.model.Membresias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMembresiasRepository extends JpaRepository<Membresias, Integer> {
    @Query("SELECT m FROM Membresias m WHERE m.idUsuarioElimino IS NULL")
    List<Membresias> obtenerActivas();
}

