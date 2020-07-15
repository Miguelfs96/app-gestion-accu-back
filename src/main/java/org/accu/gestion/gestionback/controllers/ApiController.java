package org.accu.gestion.gestionback.controllers;

import org.accu.gestion.gestionback.model.asociado.Asociado;
import org.accu.gestion.gestionback.model.hospital.Hospital;
import org.accu.gestion.gestionback.service.AsociadoService;
import org.accu.gestion.gestionback.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/accugest/api/v1")
public class ApiController {

    private AsociadoService asociadoService;
    private HospitalService hospitalService;


    @Autowired
    public ApiController(AsociadoService asociadoService, HospitalService hospitalService) {
        this.asociadoService = asociadoService;
        this.hospitalService = hospitalService;
    }

    @GetMapping(value = "/asociados")
    public List<Asociado> findAllAsociados() {
        return asociadoService.findAll();
    }


    @GetMapping(value ="/asociado/{idAsociado}")
    public Asociado findAsociadoById(@PathVariable("idAsociado") String idAsociado) throws Exception {
        return asociadoService.findAsociadoById(idAsociado);
    }

    @PostMapping(value = "/asociados/newAsociado")
    public Asociado newAsociado(@RequestBody Asociado asociado){
        return asociadoService.saveAsociado(asociado);
    }

    @PutMapping("/asociados/{idAsociado}")
    public ResponseEntity<Asociado> updateAsociado (@PathVariable(value = "idAsociado") String idAsociado,
                                                    @RequestBody Asociado asociadoDetails){
        final Asociado asociadoActualizado = asociadoService.saveAsociado(asociadoDetails);
        return ResponseEntity.ok(asociadoActualizado);
    }

    @DeleteMapping("/asociados/{idAsociado}/remove")
    public Map<String, Boolean> deleteAsociado (@PathVariable(value="idAsociado") String idAsociado) throws Exception{
        return asociadoService.deleteAsociado(idAsociado);
    }

    @GetMapping(value = "/hospitales")
    public List<Hospital> findAllHospitales() {
        return hospitalService.findAll();
    }

    @GetMapping(value = "/hospital/{idHospital}")
    public Hospital findHospitalById(@PathVariable("idHospital") String idHospital) throws Exception {
        return hospitalService.findHospitalById(idHospital);
    }

    @PostMapping(value= "/hospitales/newHospital")
    public Hospital newHospital(@RequestBody Hospital hospital){
        return hospitalService.saveHospital(hospital);
    }

    @PutMapping("/hospitales/{idHospital}")
    public ResponseEntity<Hospital> updateHospital(@PathVariable(value= "idHospital") String idHospital,
                                                   @RequestBody Hospital hospitalDetails) {
        final Hospital hospitalActualizado = hospitalService.saveHospital(hospitalDetails);
        return ResponseEntity.ok(hospitalActualizado);
    }

    @DeleteMapping("/hospitales/{idHospital}/remove")
    public Map<String, Boolean> deleteHospital (@PathVariable(value = "idHospital")String idHospital) throws Exception{
        return hospitalService.deleteHospital(idHospital);
    }
}
