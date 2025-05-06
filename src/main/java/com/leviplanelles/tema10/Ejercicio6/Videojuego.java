package com.leviplanelles.tema10.Ejercicio6;

public class Videojuego extends Multimedia{
    public enum Plataforma {
        PS5, XBOX, SWITCH
    }
    private final Plataforma plataforma;

    public Videojuego(String titulo, String autor, Formato formato, int anio, Plataforma plataforma) {
        super(titulo, autor, formato, anio);
        this.plataforma = plataforma;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Videojuego { \n");
        sb.append("Título: " + getTitulo() + ",\n");
        sb.append("Autor: " + getAutor() + ",\n");
        sb.append("Formato: " + getFormato() + ",\n");
        sb.append("Año: " + getAnio() + ",\n");
        sb.append("Plataforma: " + plataforma + "\n}");
        return sb.toString();
    }
}
