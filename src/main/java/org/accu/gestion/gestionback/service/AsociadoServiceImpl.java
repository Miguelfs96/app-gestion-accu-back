package org.accu.gestion.gestionback.service;

import org.accu.gestion.gestionback.model.asociado.Asociado;
import org.accu.gestion.gestionback.repository.AsociadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class AsociadoServiceImpl implements AsociadoService {

    private AsociadoRepository asociadoRepository;

    @Autowired
    public AsociadoServiceImpl(AsociadoRepository asociadoRepository) {
        this.asociadoRepository = asociadoRepository;
    }

    @Override
    public List<Asociado> findAll() { return asociadoRepository.findAll(); }

    @Override
    public Asociado findAsociadoById(String asociadoId) throws Exception {
        Optional<Asociado> asociado = asociadoRepository.findById(asociadoId);
        return asociado.orElseThrow(Exception::new);

    }

    @Override
    public Asociado saveAsociado(Asociado asociado) {
        return asociadoRepository.save(asociado);
    }

    @Override
    public Map<String, Boolean> deleteAsociado(String idAsociado) throws Exception {
        Asociado asociado = asociadoRepository.findById(idAsociado)
                .orElseThrow(Exception::new);
        asociadoRepository.delete(asociado);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }


}
