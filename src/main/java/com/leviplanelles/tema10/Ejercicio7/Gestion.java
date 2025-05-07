package com.leviplanelles.tema10.Ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gestion {
    private final Estadio estadio;
    private final Map<Partido, List<Entrada>> entradasPartido;

    public Gestion() {
        this.estadio = new Estadio();
        this.entradasPartido = new HashMap<>();
    }

    public void crearPartido(Afluencia afluencia, LocalDate fechaPartido, String equipoLocal, String equipoVisitante) {
        Partido partido = new Partido(afluencia, fechaPartido, equipoLocal, equipoVisitante);
        entradasPartido.put(partido, new ArrayList<>());x
    }

    public boolean ventaEntradas(Partido partido, int zone, int fila, int nAsiento) {
        Zona zona = sacarZonaPorNum(zone);
        if (zona.isVip()) {
            entradasPartido.get(partido).add(new EntradaVip(partido,zone,fila,nAsiento,estadio));
        } else {
            entradasPartido.get(partido).add(new EntradaNormal(partido,zone,fila,nAsiento,estadio));
        }
    }

    public Zona sacarZonaPorNum(int num) {
        for (Zona zona : estadio.getZonas()) {
            if (zona.equals(num)) {
                return zona;
            }
        }
        return null;
    }

    public Asiento sacarAsientoPorNum(int num, int numFila, int numAsiento) {
        Zona zona = sacarZonaPorNum(num);
        Fila fila = sacarFilaPorNumero(num,numFila);
        Asiento[] asientos = fila.getAsientos();
        for (int i = 0; i < asientos.length ; i++) {
            if (asientos[i].getNumAsiento() == numAsiento){
                return asientos[i];
            }
        }
        return null;
    }

    public Fila sacarFilaPorNumero(int zonaNumero, int filaNumero){
        Zona zona = sacarZonaPorNum(zonaNumero);
        Fila[] filasDeLaZona = zona.getFilas();
        for (int i = 0; i < filasDeLaZona.length; i++) {
            if (filasDeLaZona[i].getNumFila() == filaNumero){
                return filasDeLaZona[i];
            }
        }
        return null;
    }
}
