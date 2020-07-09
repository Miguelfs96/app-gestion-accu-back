package org.accu.gestion.gestionback.controllers;

import org.accu.gestion.gestionback.model.asociado.Asociado;
import org.accu.gestion.gestionback.service.AsociadoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class MainController {

    private AsociadoService asociadoService;

    @Autowired
    public MainController(AsociadoService asociadoService) {
        this.asociadoService = asociadoService;
    }

    @RequestMapping(value = "/asociados", method = RequestMethod.GET)
    public List<Asociado> findAll() { return asociadoService.findAll(); }


    @RequestMapping(value ="/asociado/{idAsociado}")
    public Asociado findAsociadoById(@PathVariable("idAsociado") String idAsociado) throws Exception {
        return asociadoService.findAsociadoById(idAsociado);
    }
}
