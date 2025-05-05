package com.leviplanelles.tema10.Ejercicio3;


public class CocheCambioAutomatico extends Coche{
    public CocheCambioAutomatico(String matricula, int cantMarchas) {
        super(matricula, cantMarchas);
    }

    @Override
    public void acelerar(double velocidad) {
        if (velocidad < 0) {
            System.err.println("No puedes acelerar a velocidades negativas");
        }
        if (velocidad <= getVelocidadActual()) {
            System.err.println("No puedes acelerar a una velocidad menor o igual a la que tienes actualmente");
            return;
        }
        if (velocidad >= getVelMarchas()[getMarchaActual()+1]) {
            do {
                if (getMarchaActual() == getVelMarchas().length-1) {
                    break;
                }
                setMarchaActual(getMarchaActual()+1);
            }while (velocidad >= getVelMarchas()[getMarchaActual()]);
            setVelocidadActual(velocidad);
        }
    }
    @Override
    public void frenar(double velocidad) {
        if (getMarchaActual() == 0) {
            System.err.println("No puedes frenar en neutro, para ello primero tienes que estar en movimiento.");
            return;
        }
        if (velocidad >= getVelocidadActual()) {
            System.err.println("No puedes frenar a una velocidad mayor o igual a la que tienes actualmente");
            return;
        }
        if (velocidad < 0) {
            System.err.println("No puedes frenar negativamente");
            return;
        }
        do {
            if (getMarchaActual() == 0) {
                break;
            }
            setMarchaActual(getMarchaActual()-1);
        }while (velocidad <= getVelMarchas()[getMarchaActual()]);
        setVelocidadActual(velocidad);
    }
}
