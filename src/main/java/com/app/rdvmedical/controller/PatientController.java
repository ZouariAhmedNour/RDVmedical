package com.app.rdvmedical.controller;

import com.app.rdvmedical.service.IServicePatient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
@AllArgsConstructor
public class PatientController {
    IServicePatient servicePatient;

    @GetMapping("getAll")
    public String getAllPatient(){
        return servicePatient.getAllPatient().toString();
    }
    @PostMapping("add")
    public String creerPatient(){
        return servicePatient.creerPatient(null).toString();
    }

}

