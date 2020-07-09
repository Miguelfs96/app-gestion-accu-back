package org.accu.gestion.gestionback.service;

import org.accu.gestion.gestionback.model.hospital.Hospital;
import org.accu.gestion.gestionback.repository.AsociadoRepository;
import org.accu.gestion.gestionback.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalServiceImpl implements HospitalService {

    private HospitalRepository hospitalRepository;

    @Autowired
    public HospitalServiceImpl(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    @Override
    public List<Hospital> findAll() {
        return hospitalRepository.findAll();
    }

    @Override
    public Hospital findHospitalById(String hospitalId) throws Exception {
        Optional<Hospital> hospital = hospitalRepository.findById(hospitalId);
        return hospital.orElseThrow(Exception::new);
    }
}
