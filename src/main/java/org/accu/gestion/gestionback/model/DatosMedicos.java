package org.accu.gestion.gestionback.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class DatosMedicos {
    private boolean paciente;
    private String enfermedad;

    @Field("fecha_diagnostico")
    private String fechaDiagnostico;
    private String tratamiento;

    public DatosMedicos() {
    }

    public DatosMedicos(boolean paciente, String enfermedad, String fechaDiagnostico, String tratamiento) {
        this.paciente = paciente;
        this.enfermedad = enfermedad;
        this.fechaDiagnostico = fechaDiagnostico;
        this.tratamiento = tratamiento;
    }

    public boolean isPaciente() {
        return paciente;
    }

    public void setPaciente(boolean paciente) {
        this.paciente = paciente;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getFechaDiagnostico() {
        return fechaDiagnostico;
    }

    public void setFechaDiagnostico(String fechaDiagnostico) {
        this.fechaDiagnostico = fechaDiagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
}
