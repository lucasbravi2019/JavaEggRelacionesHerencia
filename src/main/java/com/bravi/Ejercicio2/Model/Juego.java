package com.bravi.Ejercicio2.Model;

import java.util.List;
import java.util.Objects;

import com.bravi.Ejercicio2.Service.JugadorService;

public class Juego extends JugadorService {
    private List<Jugador> jugadores;

    private Revolver revolver;

    public Juego() {
    }

    public Juego(List<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public List<Jugador> getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return this.revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public Juego jugadores(List<Jugador> jugadores) {
        setJugadores(jugadores);
        return this;
    }

    public Juego revolver(Revolver revolver) {
        setRevolver(revolver);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Juego)) {
            return false;
        }
        Juego juego = (Juego) o;
        return Objects.equals(jugadores, juego.jugadores) && Objects.equals(revolver, juego.revolver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jugadores, revolver);
    }

    @Override
    public String toString() {
        return "{" + " jugadores='" + getJugadores() + "'" + ", revolver='" + getRevolver() + "'" + "}";
    }

}
