package com.proyecto.local.repository;

import com.proyecto.local.model.CatMembresia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICatMembresiaRepository extends JpaRepository<CatMembresia, Integer> {
}
