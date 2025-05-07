package com.leviplanelles.tema10.Ejercicio7;

import java.util.Arrays;

public class Fila {
    private static final int CANT_ASIENTOS = Config.CANT_ASIENTOS;
    private final Asiento[] asientos;
    private final int numFila;

    public Fila(int numFila) {
        this.asientos = new Asiento[CANT_ASIENTOS];
        this.numFila = numFila;
        rellenarFila();
    }

    private void rellenarFila() {
        for (int i = 0; i < asientos.length; i++) {
            asientos[i] = new Asiento(i+1);
        }
    }

    public int getNumFila() {
        return numFila;
    }

    public Asiento[] getAsientos() {
        return asientos;
    }

    @Override
    public String toString() {
        return "Fila{" +
                "asientos=" + Arrays.toString(asientos) +
                '}';
    }
}
