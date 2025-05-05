package com.leviplanelles.tema10.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        int importeLavadoras = 0;
        int importeTelevisiones = 0;
        List<Electrodomestico> electrodomesticos = new ArrayList<>();
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Lavadora(300,80));
        electrodomesticos.add(new Lavadora(34));
        electrodomesticos.add(new Lavadora(700,60));
        electrodomesticos.add(new Lavadora(60));
        electrodomesticos.add(new Television());
        electrodomesticos.add(new Television(1000,20));
        electrodomesticos.add(new Television(50,true));
        electrodomesticos.add(new Television(3000,15));
        electrodomesticos.add(new Television(34,false));

        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Lavadora) {
                importeLavadoras += electrodomestico.precioFinal();
            } else {
                importeTelevisiones += electrodomestico.precioFinal();
            }
        }
        System.out.println("Importe total lavadoras: " + importeLavadoras + "€");
        System.out.println("Importe total televisiones: " + importeTelevisiones + "€");
        System.out.println("Importe de los electrodomésticos: " + (importeLavadoras + importeTelevisiones) + "€");



    }
}
