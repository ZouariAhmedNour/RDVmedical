package com.app.rdvmedical.service;

import com.app.rdvmedical.dto.PatientDTO;

import java.util.List;

public interface IServicePatient {

    PatientDTO addPatient(PatientDTO dto);

    List<PatientDTO> getAllPatients();

    PatientDTO getPatientById(int id);

    PatientDTO addMaladieToPatient(int patientId, int maladieId);
}
