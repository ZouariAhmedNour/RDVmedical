package com.app.rdvmedical.service.impl;

import com.app.rdvmedical.entities.Patient;
import com.app.rdvmedical.repository.PatientRepository;
import com.app.rdvmedical.service.IServicePatient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServicePatientImpl implements IServicePatient {

    PatientRepository patientRepository;


    @Override
    public List<Patient> getAllPatient() {
        return patientRepository.findAll();
    }

    @Override
    public Patient creerPatient(Patient patient) {
        return patientRepository.save(patient);
    }
}
