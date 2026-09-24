package com.app.rdvmedical.service;

import com.app.rdvmedical.entities.Patient;

import java.util.List;

public interface IServicePatient {
   List<Patient> getAllPatient();
   Patient creerPatient(Patient patient);
}
