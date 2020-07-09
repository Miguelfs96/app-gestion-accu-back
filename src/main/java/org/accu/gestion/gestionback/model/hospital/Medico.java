package org.accu.gestion.gestionback.model.hospital;

import org.springframework.data.mongodb.core.mapping.Field;

public class Medico {
    @Field("nombre_completo")
    public String nombreCompleto;
    public String consulta;
    @Field("tlf_contacto")
    public String telefono;
    public String email;
    public String especialidad;

    public Medico() {
    }

    public Medico(String nombreCompleto, String consulta, String telefono, String email, String especialidad) {
        this.nombreCompleto = nombreCompleto;
        this.consulta = consulta;
        this.telefono = telefono;
        this.email = email;
        this.especialidad = especialidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
