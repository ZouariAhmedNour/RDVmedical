package com.app.rdvmedical.service;

import com.app.rdvmedical.entities.Maladie;

import java.util.List;
import java.util.Optional;

public interface IServiceMaladie {

    Maladie addMaladie(Maladie maladie);

    List<Maladie> getAllMaladies();

    Optional<Maladie> getMaladieByNom(String nom);

    Optional<Maladie> getMaladieById(int id);
}
