package org.accu.gestion.gestionback.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Direccion {
    private String calle;
    private String numero;
    private String portal;
    private String piso;
    private String letra;
    private String localidad;
    private String provincia;
    @Field("codigo_postal")
    private String codigoPostal;
    private String pais;

    public Direccion(String calle, String numero, String portal, String piso, String letra, String localidad, String provincia, String pais) {
        this.calle = calle;
        this.numero = numero;
        this.portal = portal;
        this.piso = piso;
        this.letra = letra;
        this.localidad = localidad;
        this.provincia = provincia;
        this.pais = pais;
    }

    public Direccion() {
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
