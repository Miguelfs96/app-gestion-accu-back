package org.accu.gestion.gestionback.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class DatosBancarios {
    @Field("IBAN")
    private String iban;
    private String titular;
    @Field("modalidad_pago")
    private String modalidadPago;
    @Field("direccion_facturacion")
    private Direccion direccionFacturacion;
    @Field("historial_facturacion")
    private Factura[] historialFacturacion;

    public DatosBancarios() {
    }

    public DatosBancarios(String iban, String titular, String modalidadPago, Direccion direccionFacturacion, Factura[] historialFacturacion) {
        this.iban = iban;
        this.titular = titular;
        this.modalidadPago = modalidadPago;
        this.direccionFacturacion = direccionFacturacion;
        this.historialFacturacion = historialFacturacion;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getModalidadPago() {
        return modalidadPago;
    }

    public void setModalidadPago(String modalidadPago) {
        this.modalidadPago = modalidadPago;
    }

    public Direccion getDireccionFacturacion() {
        return direccionFacturacion;
    }

    public void setDireccionFacturacion(Direccion direccionFacturacion) {
        this.direccionFacturacion = direccionFacturacion;
    }

    public Factura[] getHistorialFacturacion() {
        return historialFacturacion;
    }

    public void setHistorialFacturacion(Factura[] historialFacturacion) {
        this.historialFacturacion = historialFacturacion;
    }
}
