package com.leviplanelles.tema10.Ejercicio7;

import java.util.Objects;

public abstract class Entrada {
    private static int contador = 0;
    private final int id;
    private final Partido partido;
    private final int zona;
    private final int fila;
    private final int nAsiento;
    private double precioEntrada;
    private final Estadio estadio;

    public Entrada(Partido partido, int zona, int fila, int nAsiento, Estadio estadio) {
        this.id = ++contador;
        this.partido = partido;
        this.zona = zona;
        this.fila = fila;
        this.nAsiento = nAsiento;
        this.estadio = estadio;
        this.precioEntrada = calcularPrecioEntrada(partido,zona);
    }

    private double calcularPrecioEntrada(Partido partido, int zona) {
        double precio = this.estadio.getZonas()[zona].getPresioBase();
        return switch (partido.getAfluencia()) {
            case ALTA_AFLUENCIA -> precio *= 1.75;
            case MEDIA_AFLUENCIA -> precio;
            case BAJA_AFLUENCIA -> precio *= 1.30;
        };
    }
    public int getId() {
        return id;
    }

    public Partido getPartido() {
        return partido;
    }

    public int getZona() {
        return zona;
    }

    public int getFila() {
        return fila;
    }

    public int getnAsiento() {
        return nAsiento;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entrada entrada = (Entrada) o;
        return id == entrada.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Entrada{" +
                "id=" + id +
                ", partido=" + partido +
                ", zona=" + zona +
                ", fila=" + fila +
                ", nAsiento=" + nAsiento +
                '}';
    }
}
