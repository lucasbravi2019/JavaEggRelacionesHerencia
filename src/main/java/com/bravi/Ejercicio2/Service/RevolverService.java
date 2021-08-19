package com.bravi.Ejercicio2.Service;

import com.bravi.Ejercicio2.Model.Revolver;

public class RevolverService extends Revolver {

    public RevolverService() {

    }

    public RevolverService(int posicionActual, int posicionAgua) {
        setPosicionActual(posicionActual);
        setPosicionAgua(posicionAgua);
    }

    public void llenarRevolver() {
        setPosicionActual(1);
        setPosicionAgua((int) (Math.random() * 6));
    }

    public boolean mojar(Revolver revolver) {
        if (revolver.getPosicionActual() == revolver.getPosicionAgua()) {
            return true;
        }
        return false;
    }

    public void siguienteChorro(Revolver revolver) {
        revolver.setPosicionActual(revolver.getPosicionActual() + 1);
    }

}
