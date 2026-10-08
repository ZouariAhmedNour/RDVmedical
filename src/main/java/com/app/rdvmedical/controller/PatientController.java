package com.app.rdvmedical.controller;

import com.app.rdvmedical.dto.PatientDTO;
import com.app.rdvmedical.service.IServicePatient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
@AllArgsConstructor
public class PatientController {

    private IServicePatient servicePatient;

    @GetMapping("/getAll")
    public List<PatientDTO> getAllPatient() {
        return servicePatient.getAllPatients();
    }

    @PostMapping("/add")
    public PatientDTO creerPatient(@RequestBody PatientDTO patientDTO) {
        return servicePatient.addPatient(patientDTO);
    }

    @GetMapping("/getById/{id}")
    public PatientDTO getPatientById(@PathVariable int id) {
        return servicePatient.getPatientById(id);
    }

    @PostMapping("/{patientId}/maladie/{maladieId}")
    public PatientDTO addMaladieToPatient(
            @PathVariable int patientId,
            @PathVariable int maladieId
    ) {
        return servicePatient.addMaladieToPatient(patientId, maladieId);
    }
}