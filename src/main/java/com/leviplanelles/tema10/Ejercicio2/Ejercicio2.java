package com.leviplanelles.tema10.Ejercicio2;

import com.leviplanelles.tema10.Ejercicio1.Punto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Punto> puntos = new ArrayList<>();
        puntos.add(new Punto(0,0));
        puntos.add(new Punto(2,0));
        puntos.add(new Punto(2,2));
        puntos.add(new Punto(0,2));
        Poligono poligono = new Poligono(puntos);

        System.out.println(poligono);
        System.out.println("Vertices: " + poligono.numVertices());
        System.out.println("Perimetro: " + poligono.perimetro());
        poligono.traslada(4,-3);
        System.out.println(poligono);


    }
}