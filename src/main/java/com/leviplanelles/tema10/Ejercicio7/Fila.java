package com.leviplanelles.tema10.Ejercicio7;

import java.util.Arrays;

public class Fila {
    private static final int CANT_ASIENTOS = 30;
    private final Asiento[] asientos;

    public Fila() {
        this.asientos = new Asiento[CANT_ASIENTOS];
        rellenarFila();
    }

    private void rellenarFila() {
        for (int i = 0; i < asientos.length; i++) {
            asientos[i] = new Asiento(i+1);
        }
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
