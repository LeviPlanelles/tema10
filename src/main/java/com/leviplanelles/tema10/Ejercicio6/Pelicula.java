package com.leviplanelles.tema10.Ejercicio6;

public class Pelicula extends Multimedia{
    private final double duracion;
    private final String actorPrincipal;
    private final String actrizPrincipal;

    public Pelicula(String titulo, String autor, Formato formato, int anio, double duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, formato, anio);
        this.duracion = duracion;
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public double getDuracion() {
        return duracion;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Película { \n");
        sb.append("Título: " + getTitulo() + ",\n");
        sb.append("Autor: " + getAutor() + ",\n");
        sb.append("Formato: " + getFormato() + ",\n");
        sb.append("Año: " + getAnio() + ",\n");
        sb.append("Duración: " + duracion + ",\n");
        sb.append("Actor principal: " + actorPrincipal + ",\n");
        sb.append("Actriz principal: " + actrizPrincipal + "\n}");
        return sb.toString();

    }
}
