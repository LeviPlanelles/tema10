package com.leviplanelles.tema10.Ejercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EntradaNormal extends Entrada{
    private final int numLoteria;

    public EntradaNormal(Partido partido, int zona, int fila, int nAsiento, Estadio estadio) {
        super(partido, zona, fila, nAsiento, estadio);
        this.numLoteria = obtenerNumeroLoteria(partido);
    }

    private int obtenerNumeroLoteria(Partido partido) {
        Random random = new Random();
        int num = random.nextInt(1,partido.getListAsientos().size());
        int index = partido.getListAsientos().get(num);
        partido.getListAsientos().remove(index);
        return num;
    }
}
