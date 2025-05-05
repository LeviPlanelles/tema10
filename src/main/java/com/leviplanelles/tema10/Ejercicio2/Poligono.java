package com.leviplanelles.tema10.Ejercicio2;

import com.leviplanelles.tema10.Ejercicio1.Punto;

import java.util.List;

public class Poligono {
    private final List<Punto> poligono;

    public Poligono(List<Punto> poligono) {
        this.poligono = poligono;
    }

    public void traslada(int desplazamientoX, int desplazamientoY) {
        for (Punto punto : poligono) {
            punto.setX(punto.getX() + desplazamientoX);
            punto.setY(punto.getY() + desplazamientoY);
        }
    }
    public int numVertices() {
        return poligono.size();
    }

    public double perimetro() {
        double perimetro = 0;
        Punto puntoSiguiente;
        for (int i = 0; i < poligono.size(); i++) {
            if (i == poligono.size() - 1) {
                puntoSiguiente = poligono.get(0);
            } else {
                puntoSiguiente = poligono.get(i+1);
            }
            perimetro += poligono.get(i).distancia(puntoSiguiente);
        }
        return perimetro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Punto punto : poligono){
            sb.append(punto.toString()).append("\n");
        }
        return sb.toString();
    }
}
