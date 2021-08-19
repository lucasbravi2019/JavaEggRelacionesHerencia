package com.bravi.Ejercicio3.Model;

import java.util.ArrayList;
import java.util.Objects;

public class Baraja extends Carta {
    private ArrayList<Carta> cartas;

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Carta> getCartas() {
        return this.cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public Baraja cartas(ArrayList<Carta> cartas) {
        setCartas(cartas);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Baraja)) {
            return false;
        }
        Baraja baraja = (Baraja) o;
        return Objects.equals(cartas, baraja.cartas);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cartas);
    }

    @Override
    public String toString() {
        return "{" + " cartas='" + getCartas() + "'" + "}";
    }

}
