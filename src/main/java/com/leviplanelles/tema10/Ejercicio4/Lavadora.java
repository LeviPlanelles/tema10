package com.leviplanelles.tema10.Ejercicio4;

public class Lavadora extends Electrodomestico {
    //DEFAULT CONSTRUCTOR
    private final int CARGA_DEFAULT = 5;
    //-----

    private final int maxCarga;

    public Lavadora() {
        super();
        this.maxCarga = CARGA_DEFAULT;
    }
    public Lavadora(double precio, double peso) {
        super(precio,peso);
        this.maxCarga = CARGA_DEFAULT;
    }
    public Lavadora(int maxCarga) {
        super();
        this.maxCarga = maxCarga;
    }

    /**
     * Método sobrecargado que se encarga de calcular el precio final de una lavadora dependiendo de su carga máxima
     * @return
     */
    @Override
    public double precioFinal() {
        if (maxCarga > 30) {
            return super.precioFinal() + 50;
        }
        return super.precioFinal();
    }

    public int getMaxCarga() {
        return maxCarga;
    }
}
