package com.leviplanelles.tema10.Ejercicio7;

import java.util.Objects;
import java.util.UUID;

public class EntradaVip extends Entrada{
    private final String codAlfanumerico;

    public EntradaVip(Partido partido, int zona, int fila, int nAsiento, Estadio estadio) {
        super(partido, zona, fila, nAsiento, estadio);
        this.codAlfanumerico = generarPasswd();
    }

    private String generarPasswd() {
        UUID codigo = UUID.randomUUID();
        return codigo.toString();
    }

    public String getCodAlfanumerico() {
        return codAlfanumerico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EntradaVip that = (EntradaVip) o;
        return Objects.equals(codAlfanumerico, that.codAlfanumerico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), codAlfanumerico);
    }

    @Override
    public String toString() {
        return "EntradaVip{" +
                "codAlfanumerico='" + codAlfanumerico + '\'' +
                '}';
    }
}
