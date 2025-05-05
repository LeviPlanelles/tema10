package com.leviplanelles.tema10.Ejercicio4;

public class Television extends Electrodomestico{
    //DEFAULT CONSTRUCTOR
    private double DEFAULT_RESOLUTION = 20;
    private boolean DEFAULT_IS_SMARTTV = false;
    //-----
    private double resolucion;
    private boolean isSmartTV;

    public Television() {
        super();
        this.resolucion = DEFAULT_RESOLUTION;
        this.isSmartTV = DEFAULT_IS_SMARTTV;
    }
    public Television(double precio, double peso) {
        super(precio,peso);
        this.resolucion = DEFAULT_RESOLUTION;
        this.isSmartTV = DEFAULT_IS_SMARTTV;
    }
    public Television(double resolucion, boolean isSmartTV) {
        super();
        this.resolucion = resolucion;
        this.isSmartTV = isSmartTV;
    }

    /**
     * Método sobrecargado que se encarga de calcular el precio final de una Televisión de su resolución y si es o no SmartTV
     * @return
     */
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (resolucion < 40) {
            precioFinal += precioFinal * 0.30;
        }
        if (isSmartTV) {
            precioFinal += 50;
        }
        return precioFinal;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSmartTV() {
        return isSmartTV;
    }
}
