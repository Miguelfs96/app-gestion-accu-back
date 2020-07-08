package org.accu.gestion.gestionback.service;

import org.accu.gestion.gestionback.model.Asociado;
import org.accu.gestion.gestionback.repository.AsociadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsociadoServiceImpl implements AsociadoService {

    private AsociadoRepository asociadoRepository;

    @Autowired
    public AsociadoServiceImpl(AsociadoRepository asociadoRepository) {
        this.asociadoRepository = asociadoRepository;
    }

    @Override
    public List<Asociado> findAll() { return asociadoRepository.findAll(); }
}
