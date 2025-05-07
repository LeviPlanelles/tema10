package com.leviplanelles.tema10.Ejercicio7;

import java.util.Arrays;

public class Zona {
    private static final int CANT_FILAS = 15;
    private final Fila[] filas;
    private boolean vip;


    public Zona(boolean isVip) {
        this.filas = new Fila[CANT_FILAS];
        rellenarZona();
        this.vip = isVip;
    }

    private void rellenarZona() {
        for (int i = 0; i < filas.length; i++) {
            filas[i] = new Fila();
        }
    }

    public Fila[] getFilas() {
        return filas;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Zona{" +
                "filas=" + Arrays.toString(filas) +
                ", vip=" + vip +
                '}';
    }
}
