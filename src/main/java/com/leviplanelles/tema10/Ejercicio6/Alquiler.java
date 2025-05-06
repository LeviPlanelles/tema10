package com.leviplanelles.tema10.Ejercicio6;

import java.time.LocalDate;
import java.time.Period;

public class Alquiler {
    private Socio socio;
    private final Multimedia multimedia;
    private final int PRECIO_BASE = 4;
    private int precioFinal;
    private final LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private final int MAX_PERIODO = 3;

    public Alquiler(Socio socio, Multimedia multimedia) {
        this.socio = socio;
        this.multimedia = multimedia;
        this.fechaAlquiler = LocalDate.now();
        this.fechaDevolucion = null;

        if (multimedia instanceof Pelicula && multimedia.getAnio() < 2012) {
            this.precioFinal = PRECIO_BASE - 1;
        } else {
            this.precioFinal = PRECIO_BASE;
        }

        if (multimedia instanceof Videojuego && multimedia.getAnio() < 2010) {
            this.precioFinal = PRECIO_BASE - 1;
        } else {
            this.precioFinal = PRECIO_BASE;
        }
    }

    public boolean devolver() {
        if (fechaDevolucion == null) {
            fechaDevolucion = LocalDate.now();
            if (Period.between(fechaAlquiler, fechaDevolucion).getDays() > 3) {
                precioFinal += 2;
            }
            socio.setRecargoPendiente(false);
            return true;
        }
        return false;


    }

    public Socio getSocio() {
        return socio;
    }

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public int getPRECIO_BASE() {
        return PRECIO_BASE;
    }

    public int getPrecioFinal() {
        return precioFinal;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public int getMAX_PERIODO() {
        return MAX_PERIODO;
    }
}
