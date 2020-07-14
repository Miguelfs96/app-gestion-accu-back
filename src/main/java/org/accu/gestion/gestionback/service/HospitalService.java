package org.accu.gestion.gestionback.service;

import org.accu.gestion.gestionback.model.asociado.Asociado;
import org.accu.gestion.gestionback.model.hospital.Hospital;

import java.util.List;
import java.util.Map;

public interface HospitalService {

    List<Hospital> findAll();

    Hospital findHospitalById(String hospitalId) throws Exception;

    Hospital saveHospital(Hospital hospital);

    Map<String, Boolean> deleteHospital(String idHospital) throws Exception;
}
