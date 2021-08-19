package com.bravi.Ejercicio3.Service;

import java.util.ArrayList;
import java.util.List;

import com.bravi.Ejercicio3.Model.Baraja;
import com.bravi.Ejercicio3.Model.Carta;

public class BarajaService extends Baraja {

    public BarajaService() {

    }

    public BarajaService(ArrayList<Carta> cartas) {
        this.setCartas(cartas);
    }

    public void llenarBaraja() {
        ArrayList<Carta> baraja = new ArrayList<Carta>();
        for (int i = 1; i <= 12; i++) {
            for (int j = 0; j < 4; j++) {
                if (i != 8 && i != 9) {
                    if (j == 0) {
                        baraja.add(new Carta(i, "Espada"));
                    }
                    if (j == 1) {
                        baraja.add(new Carta(i, "Basto"));
                    }
                    if (j == 2) {
                        baraja.add(new Carta(i, "Oro"));
                    }
                    if (j == 3) {
                        baraja.add(new Carta(i, "Copa"));
                    }
                }
            }
            this.setCartas(baraja);
        }
    }

    public void barajar() {
        ArrayList<Carta> baraja = new ArrayList<Carta>();
        baraja.addAll(this.getCartas());
        Carta cartaTemporal;
        int indice;
        for (int i = 0; i < 40; i++) {
            indice = (int) (Math.random() * 40);
            cartaTemporal = this.getCartas().get(i);
            this.getCartas().set(i, this.getCartas().get(indice));
            this.getCartas().set(indice, cartaTemporal);
        }
    }

    public void siguienteCarta() {
        System.out.println(this.getCartas().get(0));
    }

    public void cartasDisponibles() {
        System.out
                .println("La cantidad de cartas disponibles para repartir son: " + this.getCartas().size() + " cartas");
    }

    public void darCartas(int cartas) {
        List<Carta> cartasEntregadas = new ArrayList<Carta>();
        cartasEntregadas = this.getCartas().subList(0, cartas);
        ArrayList<Carta> baraja = new ArrayList<Carta>(cartasEntregadas);
        for (Carta carta : baraja) {
            System.out.println(carta);
        }
        this.getCartas().subList(0, cartas).clear();
    }

    public void mostrarBaraja() {
        for (Carta carta : this.getCartas()) {
            System.out.println(carta);
        }
    }
}
