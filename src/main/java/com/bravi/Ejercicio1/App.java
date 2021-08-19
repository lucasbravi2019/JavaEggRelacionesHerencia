package com.bravi.Ejercicio1;

import java.util.Scanner;

import com.bravi.Ejercicio1.Service.PerroService;
import com.bravi.Ejercicio1.Service.PersonaService;

public class App {
    static Scanner scan = new Scanner(System.in);
    static PersonaService p = new PersonaService();
    static PerroService perro = new PerroService();

    public static void main(String[] args) {
        int operacion = 0;
        while (operacion != 6) {
            System.out.println("\tMenu");
            System.out.println("1. Crear persona");
            System.out.println("2. Crear Perro");
            System.out.println("3. Mostrar persona");
            System.out.println("4. Mostrar perro");
            System.out.println("5. Agregar perro");
            System.out.println("6. Salir");
            operacion = Integer.valueOf(scan.nextLine());
            if (operacion == 1) {
                p.crearPersona();
            }
            if (operacion == 2) {
                perro.crearPerro(p.getNombre());
            }
            if (operacion == 3) {
                System.out.println(p);
            }
            if (operacion == 4) {
                System.out.println(perro);
            }
            if (operacion == 5) {
                p.agregarPerro(perro);
            }
            if (operacion == 6) {
                return;
            }
        }
    }
}
