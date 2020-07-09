package org.accu.gestion.gestionback.model.hospital;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Hospitales")
public class Hospital {

    @Id
    private String hospitalId;
    @Field("nombre_hospital")
    private String nombreHospital;
    private String abreviatura;
    private Medico especialistas;

    public Hospital() {
    }

    public Hospital(String hospitalId, String nombreHospital, String abreviatura, Medico especialistas) {
        this.hospitalId = hospitalId;
        this.nombreHospital = nombreHospital;
        this.abreviatura = abreviatura;
        this.especialistas = especialistas;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public Medico getEspecialistas() {
        return especialistas;
    }

    public void setEspecialistas(Medico especialistas) {
        this.especialistas = especialistas;
    }
}
