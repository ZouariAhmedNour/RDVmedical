package com.app.rdvmedical.service.impl;

import com.app.rdvmedical.entities.Rdv;
import com.app.rdvmedical.repository.RdvRepository;
import com.app.rdvmedical.service.IServiceRdv;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceRdvImpl implements IServiceRdv {

    RdvRepository rdvRepository;

    @Override
    public List<Rdv> getAllRdv() {
       return rdvRepository.findAll();
    }

    @Override
    @Transactional
    public Rdv creerRdv(Rdv rdv) {
        return  rdvRepository.save(rdv);
    }
}
