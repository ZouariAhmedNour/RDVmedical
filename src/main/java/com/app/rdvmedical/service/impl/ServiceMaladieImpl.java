package com.app.rdvmedical.service.impl;

import com.app.rdvmedical.entities.Maladie;
import com.app.rdvmedical.repository.MaladieRepository;
import com.app.rdvmedical.service.IServiceMaladie;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ServiceMaladieImpl implements IServiceMaladie {

    private MaladieRepository maladieRepository;

    @Override
    public Maladie addMaladie(Maladie maladie) {
        return maladieRepository.save(maladie);
    }

    @Override
    public List<Maladie> getAllMaladies() {
        return maladieRepository.findAll();
    }

    @Override
    public Optional<Maladie> getMaladieByNom(String nom) {
        return maladieRepository.findByNom(nom);
    }

    @Override
    public Optional<Maladie> getMaladieById(int id) {
        return maladieRepository.findById(id);
    }
}
