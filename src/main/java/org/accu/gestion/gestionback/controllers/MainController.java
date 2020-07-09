package org.accu.gestion.gestionback.controllers;

import org.accu.gestion.gestionback.model.Asociado;
import org.accu.gestion.gestionback.service.AsociadoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MainController {

    private AsociadoService asociadoService;

    @Autowired
    public MainController(AsociadoService asociadoService) {
        this.asociadoService = asociadoService;
    }

    @CrossOrigin
    @RequestMapping(value = "/asociados", method = RequestMethod.GET)
    public List<Asociado> findAll() { return asociadoService.findAll(); }
}
