package org.accu.gestion.gestionback.service;

import org.accu.gestion.gestionback.model.asociado.Asociado;

import java.util.List;
import java.util.Map;

public interface AsociadoService {

    List<Asociado> findAll();

    Asociado findAsociadoById(String asociadoId) throws Exception;

    Asociado saveAsociado(Asociado asociado);

   Map<String, Boolean> deleteAsociado(String idAsociado) throws Exception;
}
