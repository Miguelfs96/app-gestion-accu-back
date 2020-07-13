package org.accu.gestion.gestionback.service;

import org.accu.gestion.gestionback.model.asociado.Asociado;

import java.util.List;

public interface AsociadoService {

    List<Asociado> findAll();

    Asociado findAsociadoById(String asociadoId) throws Exception;

    Asociado saveAsociado(Asociado asociado);
}
