package com.leviplanelles.tema10.Ejercicio6;

import com.leviplanelles.tema10.Ejercicio1.Punto;
import com.leviplanelles.tema10.lib.IO;

import java.sql.SQLOutput;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Ejercicio6 {
    private static List<Socio> socios;
    public static void main(String[] args) {


    }
    public static void menu() {
        System.out.println("++ TIENDA DE MULTIMEDIA ++");
        System.out.println("1. Altas");
        System.out.println("2. Alquilar multimedia");
        System.out.println("3. Devolver multimedia");
        System.out.println("4. Listados");
        System.out.println("---------------------------------");
        System.out.println("0. Salir");
        int choice = IO.solicitarInt("Elige: ", 0,4);
        switch (choice) {
            case 0 ->{}
            case 1 -> subMenuAltas();
            case 2 -> alquilarMultimedia();
            case 3 -> {}
            case 4 -> {}
        }
    }
    public static void subMenuAltas() {

    }
    public static void alquilarMultimedia() {
        boolean check;
        System.out.println("1. Nuevo socio");
        System.out.println("2. Ya estoy registrado");
        Socio socio;
        int contador = 0;
        int choice = IO.solicitarInt("",1,2);
        if (choice == 1) {
            String nif = IO.solicitarString("NIF: ");
            String nombre = IO.solicitarString("Nombre: ");
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaNac = null;
            do {
                try {
                    String fechaString = IO.solicitarString("Fecha de nacimiento (dd/mm/yyyy): ");
                    fechaNac = LocalDate.parse(fechaString, dateTimeFormatter);
                    check = true;
                } catch (DateTimeException dte) {
                    check = false;
                }
            }while (!check);
            String poblacion = IO.solicitarString("Población: ");
            socio = new Socio(nif,nombre,fechaNac,poblacion);
            socios.add(socio);
        } else {
            String nif = IO.solicitarString("NIF del socio ya registrado: ");
            for (Socio s : socios) {
                if (nif.equals(s.getNif())) {
                    contador++;
                    socio = s;
                }
            }
        }
        int eleccion = IO.solicitarInt("1. Alquilar VideoJuego\n 2. Alquilar Pelicula",1,2);

        String titulo = IO.solicitarString("Titulo: ");
        String autor = IO.solicitarString("Autor: ");
        int formatoInt = IO.solicitarInt("1. CD\n2. DVD\n3. BLU-RAY\n4. Archivo\nElige: ",1,4);
        Multimedia.Formato formato = switch (formatoInt) {
            case 1 -> Multimedia.Formato.CD;
            case 2 -> Multimedia.Formato.DVD;
            case 3 -> Multimedia.Formato.BLURAY;
            case 4 -> Multimedia.Formato.ARCHIVO;
            default -> throw new IllegalStateException("Unexpected value: " + formatoInt);
        };
        int anio = IO.solicitarInt("Año de estreno: ",1800,2025);
        switch (eleccion) {
            case 1 -> {
                int plataformaInt = IO.solicitarInt("1. PS5\n2. XBOX\n3. Switch\nElige: ",1,3);
                Videojuego.Plataforma plataforma = switch (plataformaInt) {
                    case 1 -> Videojuego.Plataforma.PS5;
                    case 2 -> Videojuego.Plataforma.XBOX;
                    case 3 -> Videojuego.Plataforma.SWITCH;
                    default -> throw new IllegalStateException("Unexpected value: " + plataformaInt);
                };
                Videojuego videojuego = new Videojuego(titulo,autor,formato,anio,plataforma);
                socios.get(contador).alquilar(videojuego);
            }
            case 2 -> {
                int duracion = IO.solicitarInt("Duración: ",20,300);
                String actorPrincipal = IO.solicitarString("Actor principal: ");
                String actrizPrincipal = IO.solicitarString("Actriz principal: ");
                Pelicula pelicula = new Pelicula(titulo,autor,formato,anio,duracion,actorPrincipal,actrizPrincipal);
            }
        }

    }
}
