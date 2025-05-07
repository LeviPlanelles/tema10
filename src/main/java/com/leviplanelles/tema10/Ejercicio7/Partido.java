package com.leviplanelles.tema10.Ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Partido {
    private static int contador = 0;
    private final int id;
    private final Afluencia afluencia;
    private final LocalDate fechaPartido;
    private final String equipoLocal;
    private final String equipoVisitante;
    private List<Integer> listAsientos;


    public Partido(Afluencia afluencia, LocalDate fechaPartido, String equipoLocal, String equipoVisitante) {
        this.id = ++contador;
        this.afluencia = afluencia;
        this.fechaPartido = fechaPartido;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        generarLoteria();
    }

    private void generarLoteria() {
        for (int i = 1; i < Config.TOTAL_ASIENTOS; i++) {
            listAsientos.add(i);
        }
    }

    public List<Integer> getListAsientos() {
        return listAsientos;
    }

    public Afluencia getAfluencia() {
        return afluencia;
    }

    public LocalDate getFechaPartido() {
        return fechaPartido;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Partido partido = (Partido) o;
        return id == partido.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Partido{" +
                "afluencia=" + afluencia +
                ", fechaPartido=" + fechaPartido +
                ", equipoLocal='" + equipoLocal + '\'' +
                ", equipoVisitante='" + equipoVisitante + '\'' +
                '}';
    }
}
