package com.jalasoft.task5;

public class Detalle {

    private String codDetalle;
    private String producto;
    private int cantidad;
    private int precio;
    private int descuento;
    private int total;

    public Detalle(String codDetalle, String producto, int cantidad, int precio, int descuento, int total) {
        this.codDetalle = codDetalle;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
        this.total = total;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
}
