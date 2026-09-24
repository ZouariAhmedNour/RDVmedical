package com.app.rdvmedical.repository;

import com.app.rdvmedical.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RdvRepository extends JpaRepository<Patient, Integer> {


}
