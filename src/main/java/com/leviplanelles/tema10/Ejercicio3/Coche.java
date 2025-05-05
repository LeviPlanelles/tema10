package com.leviplanelles.tema10.Ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Coche {
    private final String matricula;
    private double velocidadActual;
    private int marchaActual;
    private final int[] velMarchas;

    public Coche(String matricula, int cantMarchas) {
        this.matricula = matricula;
        this.velMarchas = new int[cantMarchas+1];
        rellenarArrayMarchas();
        this.velocidadActual = 0;
        this.marchaActual = 0;
    }

    public void acelerar(double velocidad) {
        if (marchaActual == 0) {
            System.err.println("No puedes acelerar en neutro, cambia de marcha.");
            return;
        }
        if (velocidad <= velocidadActual) {
            System.err.println("No puedes acelerar a una velocidad menor o igual a la que tienes actualmente");
            return;
        }
        if (!(velocidad <= velMarchas[marchaActual])) {
            System.err.println("Para seguir acelerando sube de marcha que vas a reventar el motor");
            return;
        }
        velocidadActual = velocidad;
    }

    public void cambiarMarcha(int marcha) {
        if (marcha < 0) {
            System.err.println("No puedes cambiar a una marcha negativa");
            return;
        }
        if (marcha > velMarchas.length-1) {
            System.err.println("No te flipes que no tienes tantas marchas");
            return;
        }
        if (marcha == marchaActual) {
            System.err.println("No puedes cambiar de marcha a la misma marcha");
            return;
        }
        marchaActual = marcha;
    }

    public void frenar(double velocidad) {
        if (marchaActual == 0) {
            System.err.println("No puedes frenar en neutro, para ello primero tienes que estar en movimiento.");
            return;
        }
        if (velocidad >= velocidadActual) {
            System.err.println("No puedes frenar a una velocidad mayor o igual a la que tienes actualmente");
            return;
        }
        if (velocidad < 0) {
            System.err.println("No puedes frenar negativamente");
        }
        velocidadActual = velocidad;
    }

    private void rellenarArrayMarchas() {
        for (int i = 0; i < velMarchas.length; i++) {
            velMarchas[i] = (i*25 + (5*i));
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public int getMarchaActual() {
        return marchaActual;
    }

    public int[] getVelMarchas() {
        return velMarchas;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public void setMarchaActual(int marchaActual) {
        this.marchaActual = marchaActual;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return Objects.equals(matricula, coche.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", velocidadActual=" + velocidadActual +
                ", marchaActual=" + marchaActual +
                ", velMarchas=" + Arrays.toString(velMarchas) +
                '}';
    }
}
