package com.leviplanelles.tema10.Ejercicio7;

public class Asiento {
    private final int numAsiento;
    private boolean ocupado;

    public Asiento(int numAsiento) {
        this.numAsiento = numAsiento;
        this.ocupado = false;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "numAsiento=" + numAsiento +
                ", ocupado=" + ocupado +
                '}';
    }
}
