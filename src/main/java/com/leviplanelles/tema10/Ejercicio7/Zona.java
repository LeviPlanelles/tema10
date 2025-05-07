package com.leviplanelles.tema10.Ejercicio7;

import java.util.Arrays;
import java.util.Objects;

public class Zona {
    private static final int CANT_FILAS = Config.CANT_FILAS;
    private final Fila[] filas;
    private boolean vip;
    private double presioBase;
    private static int contador = 0;
    private final int id;


    public Zona(boolean isVip) {
        this.id = ++contador;
        this.filas = new Fila[CANT_FILAS];
        rellenarZona();
        this.vip = isVip;
        if (isVip) {
            this.presioBase = 120;
        } else {
            this.presioBase = 60;
        }
    }

    private void rellenarZona() {
        for (int i = 0; i < filas.length; i++) {
            filas[i] = new Fila(i+1);
        }
    }

    public Fila[] getFilas() {
        return filas;
    }

    public boolean isVip() {
        return vip;
    }

    public double getPresioBase() {
        return presioBase;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zona zona = (Zona) o;
        return id == zona.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Zona{" +
                "filas=" + Arrays.toString(filas) +
                ", vip=" + vip +
                '}';
    }
}
