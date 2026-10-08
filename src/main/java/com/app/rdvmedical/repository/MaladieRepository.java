package com.app.rdvmedical.repository;

import com.app.rdvmedical.entities.Maladie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MaladieRepository extends JpaRepository<Maladie, Integer> {

    Optional<Maladie> findByNom(String nom);
}
