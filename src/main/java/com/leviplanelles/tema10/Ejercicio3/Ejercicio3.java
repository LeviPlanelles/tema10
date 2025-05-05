package com.leviplanelles.tema10.Ejercicio3;

import com.leviplanelles.tema10.lib.IO;

public class Ejercicio3 {
    public static void main(String[] args) {
        String matricula = IO.solicitarString("Matricula: ");
        int marchas = IO.solicitarInt("Número de marchas: ",3,8);
        Coche coche = new Coche(matricula,marchas);
        System.out.println(coche);
        coche.cambiarMarcha(3);
        coche.acelerar(60);
        System.out.println(coche);
    }
}
