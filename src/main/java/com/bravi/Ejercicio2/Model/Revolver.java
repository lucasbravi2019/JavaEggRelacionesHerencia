package com.bravi.Ejercicio2.Model;

import java.util.Objects;

public class Revolver {
    private int posicionActual;

    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return this.posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return this.posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public Revolver posicionActual(int posicionActual) {
        setPosicionActual(posicionActual);
        return this;
    }

    public Revolver posicionAgua(int posicionAgua) {
        setPosicionAgua(posicionAgua);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Revolver)) {
            return false;
        }
        Revolver revolver = (Revolver) o;
        return posicionActual == revolver.posicionActual && posicionAgua == revolver.posicionAgua;
    }

    @Override
    public int hashCode() {
        return Objects.hash(posicionActual, posicionAgua);
    }

    @Override
    public String toString() {
        return "{" + " posicionActual='" + getPosicionActual() + "'" + ", posicionAgua='" + getPosicionAgua() + "'"
                + "}";
    }
}
