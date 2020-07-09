package org.accu.gestion.gestionback.service;

import org.accu.gestion.gestionback.model.hospital.Hospital;

import java.util.List;

public interface HospitalService {

    List<Hospital> findAll();

    Hospital findHospitalById(String hospitalId) throws Exception;
}
