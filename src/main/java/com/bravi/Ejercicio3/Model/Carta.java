package com.bravi.Ejercicio3.Model;

import java.util.Objects;

public class Carta {
    private int valor;

    private String palo;

    public Carta() {
    }

    public Carta(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getPalo() {
        return this.palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public Carta valor(int valor) {
        setValor(valor);
        return this;
    }

    public Carta palo(String palo) {
        setPalo(palo);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Carta)) {
            return false;
        }
        Carta carta = (Carta) o;
        return valor == carta.valor && Objects.equals(palo, carta.palo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor, palo);
    }

    @Override
    public String toString() {
        return "{" + " valor='" + getValor() + "'" + ", palo='" + getPalo() + "'" + "}";
    }

}
