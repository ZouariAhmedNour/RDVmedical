package com.app.rdvmedical.mapper;

import com.app.rdvmedical.dto.PatientDTO;
import com.app.rdvmedical.entities.Patient;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PatientMapper {

    public Patient toEntity(PatientDTO dto) {

        Patient patient = new Patient();

        patient.setId(dto.getId());
        patient.setNom(dto.getNom());
        patient.setPrenom(dto.getPrenom());
        patient.setAge(dto.getAge());
        patient.setTel(dto.getTel());

        // La liste des maladies reste vide
        patient.setMaladies(Collections.emptyList());

        return patient;
    }

    public PatientDTO toDTO(Patient patient) {

        List<String> nomsMaladies = patient.getMaladies() == null
                ? Collections.emptyList()
                : patient.getMaladies()
                .stream()
                .map(maladie -> maladie.getNom())
                .collect(Collectors.toList());

        return new PatientDTO(
                patient.getId(),
                patient.getNom(),
                patient.getPrenom(),
                patient.getAge(),
                patient.getTel(),
                nomsMaladies
        );
    }

    public List<PatientDTO> toDTOList(List<Patient> patients) {

        return patients.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }
}
