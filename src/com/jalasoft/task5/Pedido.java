package com.jalasoft.task5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private String codPedido;
    private TipoPedido tipoPedido; // NORMAL | PROGRAMADO
    private String cliente;
    private Date fecha;

    private List<Detalle> detalles;

    public Pedido(String codPedido, TipoPedido tipoPedido, String cliente, Date fecha) {
        this.codPedido = codPedido;
        this.tipoPedido = tipoPedido;
        this.cliente = cliente;
        this.fecha = fecha;

        detalles = new ArrayList<>();
    }

    public String getCodPedido() {
        return codPedido;
    }

    public TipoPedido getTipoPedido() {
        return tipoPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void addDetalle(Detalle detalle) {
        detalles.add(detalle);
    }

    public List<Detalle> getDetalles() {
        return detalles;
    }
}
