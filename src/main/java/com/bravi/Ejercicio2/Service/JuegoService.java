package com.bravi.Ejercicio2.Service;

import java.util.List;
import java.util.ArrayList;

import com.bravi.Ejercicio2.Model.Juego;
import com.bravi.Ejercicio2.Model.Jugador;
import com.bravi.Ejercicio2.Model.Revolver;

public class JuegoService extends Juego {

    public JuegoService() {

    }

    public JuegoService(List<Jugador> jugadores, Revolver revolver) {
        setJugadores(jugadores);
        setRevolver(revolver);
    }

    public void llenarJuego(int cantidadJugadores) {
        List<Jugador> jugadores = new ArrayList<Jugador>();
        for (int i = 0; i < cantidadJugadores; i++) {
            jugadores.add(new Jugador(i + 1));
        }
        RevolverService revolver = new RevolverService();
        revolver.llenarRevolver();
        setJugadores(jugadores);
        setRevolver(revolver);
    }

    public void ronda() {
        for (int i = 0; i < getJugadores().size(); i++) {
            disparo(getJugadores().get(i), getRevolver());
            System.out.println(getJugadores().get(i).getNombre());
            if (getJugadores().get(i).getMojado()) {
                System.out.println("El " + getJugadores().get(i).getNombre() + " perdio");
                return;
            } else {
                System.out.println("El " + getJugadores().get(i).getNombre() + " se salvo!");
            }
        }
    }
}
