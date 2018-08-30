package com.armiixteryx.Utilidades;

import java.text.DecimalFormat;

public class Producto {
    private String nombre;
    private int unidades;
    private float precio;
    private DecimalFormat fmt;

    public Producto(String nombre, int unidades, float precio) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.precio = precio;
        fmt = new DecimalFormat("0.##");
    }

    public String toString() {
        return nombre + ":\t" + unidades + " a Bs " + precio + " = "
                + fmt.format(unidades * precio);
    }

    public String getDatos() {
        return nombre + " " + unidades + " " + precio;
    }
}
