package com.app.rdvmedical.service;

import org.springframework.stereotype.Service;

@Service
public interface IServiceRdv {
    void saveRdv();
    void updateRdv();
    void deleteRdv();
    void getAllRdv(Long id);
    void getRdvById(Long id);
    void creerRdv();
}
