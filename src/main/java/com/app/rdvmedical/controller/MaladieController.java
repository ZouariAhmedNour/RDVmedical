package com.app.rdvmedical.controller;

import com.app.rdvmedical.entities.Maladie;
import com.app.rdvmedical.service.IServiceMaladie;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/maladie")
@AllArgsConstructor
public class MaladieController {

    private IServiceMaladie serviceMaladie;

    @PostMapping("/add")
    public Maladie addMaladie(@RequestBody Maladie maladie) {
        return serviceMaladie.addMaladie(maladie);
    }

    @GetMapping("/getAll")
    public List<Maladie> getAllMaladies() {
        return serviceMaladie.getAllMaladies();
    }

    @GetMapping("/getByNom/{nom}")
    public Optional<Maladie> getMaladieByNom(@PathVariable String nom) {
        return serviceMaladie.getMaladieByNom(nom);
    }
}
