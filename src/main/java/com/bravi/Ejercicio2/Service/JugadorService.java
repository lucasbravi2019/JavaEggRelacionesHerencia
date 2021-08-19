package com.bravi.Ejercicio2.Service;

import com.bravi.Ejercicio2.Model.Jugador;
import com.bravi.Ejercicio2.Model.Revolver;

public class JugadorService extends Jugador {

    public JugadorService() {

    }

    public JugadorService(int id) {
        setId(id);
    }

    public void disparo(Jugador jugador, Revolver revolver) {
        if (revolver.getPosicionActual() == revolver.getPosicionAgua()) {
            jugador.setMojado(true);
        } else {
            jugador.siguienteChorro(revolver);
        }
    }
}
