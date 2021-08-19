package com.bravi.Ejercicio2;

import java.util.Scanner;

import com.bravi.Ejercicio2.Service.JuegoService;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de jugadores");
        int cantidadJugadores = Integer.valueOf(scan.nextLine());
        if (cantidadJugadores > 6) {
            cantidadJugadores = 6;
        }
        JuegoService juego = new JuegoService();
        juego.llenarJuego(cantidadJugadores);
        juego.ronda();
        scan.close();
    }
}
