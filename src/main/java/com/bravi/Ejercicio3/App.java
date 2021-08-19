package com.bravi.Ejercicio3;

import com.bravi.Ejercicio3.Service.BarajaService;

public class App {
    public static void main(String[] args) {
        BarajaService baraja = new BarajaService();
        baraja.llenarBaraja();
        baraja.mostrarBaraja();
        System.out.println("Revolviendo...");
        baraja.barajar();
        baraja.mostrarBaraja();
        baraja.siguienteCarta();
        baraja.cartasDisponibles();
        System.out.println("Repartiendo...");
        baraja.darCartas(5);
        baraja.cartasDisponibles();
        System.out.println("Baraja restante...");
        baraja.mostrarBaraja();
    }
}
