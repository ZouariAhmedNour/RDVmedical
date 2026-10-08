package com.app.rdvmedical.controller;

import com.app.rdvmedical.entities.Patient;
import com.app.rdvmedical.service.IServicePatient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
@AllArgsConstructor
public class PatientController {

    IServicePatient servicePatient;

    @GetMapping("getAll")
    public Iterable<Patient> getAllPatient() {
        return servicePatient.getAllPatient();
    }

    @PostMapping("add")
    public Patient creerPatient(@RequestBody Patient patient) {
        return servicePatient.creerPatient(patient);
    }
}

