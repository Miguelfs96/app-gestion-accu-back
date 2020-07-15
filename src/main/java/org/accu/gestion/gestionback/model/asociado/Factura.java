package org.accu.gestion.gestionback.model.asociado;

import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class Factura {
    private String ano;
    @Field("cantidad_a_pagar")
    private String cantidadAPagar;

    @Field("fecha_pago")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaPago;

    private boolean pagado;

    public Factura(String ano, String cantidadAPagar, LocalDate fechaPago, boolean pagado) {
        this.ano = ano;
        this.cantidadAPagar = cantidadAPagar;
        this.fechaPago = fechaPago;
        this.pagado = pagado;
    }

    public Factura() {
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCantidadAPagar() {
        return cantidadAPagar;
    }

    public void setCantidadAPagar(String cantidadAPagar) {
        this.cantidadAPagar = cantidadAPagar;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

}
