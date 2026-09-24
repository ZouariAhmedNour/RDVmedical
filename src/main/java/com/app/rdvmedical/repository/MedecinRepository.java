package com.app.rdvmedical.repository;

import com.app.rdvmedical.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin, Integer> {
}
