package com.leviplanelles.tema10.Ejercicio7;

import java.util.Arrays;

public class Estadio {
    private static final int CANT_ZONAS = Config.CANT_ZONAS;
    private final Zona[] zonas;

    public Estadio() {
        this.zonas = new Zona[CANT_ZONAS];
        rellenarEstadio();
    }

    private void rellenarEstadio() {
        int zonasVip = CANT_ZONAS / 3;
        int zonaNormal = CANT_ZONAS - zonasVip;
        for (int i = 0; i < zonasVip; i++) {
            zonas[i] = new Zona(true);
        }
        for (int i = zonasVip; i < zonaNormal; i++) {
            zonas[i] = new Zona(false);
        }
    }

    public Zona[] getZonas() {
        return zonas;
    }

    @Override
    public String toString() {
        return "Estadio{" +
                "zonas=" + Arrays.toString(zonas) +
                '}';
    }
}
