package com.leviplanelles.tema10.Ejercicio4;

public class Electrodomestico {
    public enum ConsumoEnergetico {
        A,B,C,D,E,F
    }
    public enum Color {
        BLANCO, NEGRO, ROJO, AZUL, GRIS
    }
    //DEFAULT CONSTRUCTOR
    private final int PRECIO_BASE_DEFAULT = 100;
    private final Color COLOR_DEFAULT = Color.BLANCO;
    private final ConsumoEnergetico DEFAULT_CONSUMO = ConsumoEnergetico.F;
    private final int PESO_DEFAULT = 5;
    //-----

    protected double precioBase;
    protected final Color color;
    protected final ConsumoEnergetico consumoEnergetico;
    protected final double peso;

    public Electrodomestico(int precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public Electrodomestico() {
        this.precioBase = PRECIO_BASE_DEFAULT;
        this.color = COLOR_DEFAULT;
        this.consumoEnergetico = DEFAULT_CONSUMO;
        this.peso = PESO_DEFAULT;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLOR_DEFAULT;
        this.consumoEnergetico = DEFAULT_CONSUMO;

    }

    private Color comprobarColor(String color) {
         return switch (color) {
            case "blanco" -> Color.BLANCO;
            case "negro" -> Color.NEGRO;
            case "rojo" -> Color.ROJO;
            case "azul" -> Color.AZUL;
            case "gris" -> Color.GRIS;
            default -> COLOR_DEFAULT;
        };
    }

    private ConsumoEnergetico comprobarConsumoEnergetico(char consumoEnergetico) {
        return switch (consumoEnergetico) {
            case 'A' -> ConsumoEnergetico.A;
            case 'B' -> ConsumoEnergetico.B;
            case 'C' -> ConsumoEnergetico.C;
            case 'D' -> ConsumoEnergetico.D;
            case 'E' -> ConsumoEnergetico.E;
            case 'F' -> ConsumoEnergetico.F;
            default -> DEFAULT_CONSUMO;
        };
    }

    public double precioFinal() {
        int tamanio;
        int consumo = switch (consumoEnergetico) {
            case A -> 100;
            case B -> 80;
            case C -> 60;
            case D -> 50;
            case E -> 30;
            case F -> 10;
        };
        if (peso >= 0 && peso < 20) {
            tamanio = 10;
        } else if (peso < 50) {
            tamanio = 50;
        } else if (peso < 80) {
            tamanio = 80;
        } else {
            tamanio = 100;
        }
        return precioBase + consumo + tamanio;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public Color getColor() {
        return color;
    }

    public ConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color=" + color +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
