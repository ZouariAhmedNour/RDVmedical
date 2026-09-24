package com.app.rdvmedical.service;

import com.app.rdvmedical.entities.Rdv;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceRdv {
    List<Rdv> getAllRdv();
    Rdv creerRdv(Rdv rdv);
}
