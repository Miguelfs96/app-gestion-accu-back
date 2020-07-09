package org.accu.gestion.gestionback.model.asociado;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Document (collection = "Asociados")
public class Asociado {

    @Id
    private String asociadoId;
    private String nombre;
    @Field("apellido_1")
    private String apellido1;
    @Field("apellido_2")
    private String apellido2;

    @Field("fecha_nacimiento")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaNacimiento;

    private String dni;

    @Field("fecha_alta")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaAlta;

    @Field("fecha_baja")
    private String fechaBaja;

    @Field("datos_bancarios")
    private DatosBancarios datosBancarios;

    private Direccion direccion;

    @Field("datos_medicos")
    private DatosMedicos datosMedicos;

    public String getAsociadoId() {
        return asociadoId;
    }

    public void setAsociadoId(String asociadoId) {
        this.asociadoId = asociadoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public DatosBancarios getDatosBancarios() {
        return datosBancarios;
    }

    public void setDatosBancarios(DatosBancarios datosBancarios) {
        this.datosBancarios = datosBancarios;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public DatosMedicos getDatosMedicos() {
        return datosMedicos;
    }

    public void setDatosMedicos(DatosMedicos datosMedicos) {
        this.datosMedicos = datosMedicos;
    }
}
