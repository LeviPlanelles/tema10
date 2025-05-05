package com.leviplanelles.tema10.Ejercicio1;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distancia(Punto punto) {
        double disX = this.x - punto.getX();
        double disY = this.y - punto.getY();
        return Math.sqrt((disX * disX) + (disY * disY));
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }
}
