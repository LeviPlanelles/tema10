package com.leviplanelles.tema10.Ejercicio6;

import com.leviplanelles.tema10.Ejercicio4.Electrodomestico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Socio {
    private final String nif;
    private final String nombre;
    private final LocalDate fechaNac;
    private String poblacion;
    private boolean recargoPendiente;
    private List<Alquiler> alquileres;

    public Socio(String nif, String nombre, LocalDate fechaNac, String poblacion) {
        this.nif = nif;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.poblacion = poblacion;
        this.recargoPendiente = false;
        this.alquileres = new ArrayList<>();
    }

    public boolean alquilar(Multimedia multimedia) {
        if (recargoPendiente == true) {
            return false;
        }
        alquileres.add(new Alquiler(this,multimedia));
        return true;
    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setRecargoPendiente(boolean recargoPendiente) {
        this.recargoPendiente = recargoPendiente;
    }
}
