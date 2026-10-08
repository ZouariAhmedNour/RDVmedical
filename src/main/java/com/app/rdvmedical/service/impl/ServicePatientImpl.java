package com.app.rdvmedical.service.impl;

import com.app.rdvmedical.dto.PatientDTO;
import com.app.rdvmedical.entities.Maladie;
import com.app.rdvmedical.entities.Patient;
import com.app.rdvmedical.mapper.PatientMapper;
import com.app.rdvmedical.repository.MaladieRepository;
import com.app.rdvmedical.repository.PatientRepository;
import com.app.rdvmedical.service.IServicePatient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ServicePatientImpl implements IServicePatient {

    private PatientRepository patientRepository;
    private MaladieRepository maladieRepository;
    private PatientMapper patientMapper;

    @Override
    public PatientDTO addPatient(PatientDTO dto) {

        Patient patient = patientMapper.toEntity(dto);

        Patient savedPatient = patientRepository.save(patient);

        return patientMapper.toDTO(savedPatient);
    }

    @Override
    public List<PatientDTO> getAllPatients() {

        List<Patient> patients = patientRepository.findAll();

        return patientMapper.toDTOList(patients);
    }

    @Override
    public PatientDTO getPatientById(int id) {

        Patient patient = patientRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Patient introuvable avec l'id : " + id)
                );

        return patientMapper.toDTO(patient);
    }

    @Override
    @Transactional
    public PatientDTO addMaladieToPatient(int patientId, int maladieId) {

        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Patient introuvable avec l'id : " + patientId
                        )
                );

        Maladie maladie = maladieRepository.findById(maladieId)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Maladie introuvable avec l'id : " + maladieId
                        )
                );

        if (patient.getMaladies() == null) {
            patient.setMaladies(new ArrayList<>());
        }

        if (!patient.getMaladies().contains(maladie)) {
            patient.getMaladies().add(maladie);
        }

        Patient savedPatient = patientRepository.save(patient);

        return patientMapper.toDTO(savedPatient);
    }
}