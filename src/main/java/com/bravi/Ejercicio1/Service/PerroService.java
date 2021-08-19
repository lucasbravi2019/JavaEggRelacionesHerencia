package com.bravi.Ejercicio1.Service;

import com.bravi.Ejercicio1.Razas.Razas;
import com.bravi.Ejercicio1.Tamaños.Tamaños;

import java.util.Scanner;

import com.bravi.Ejercicio1.Model.Perro;

public class PerroService extends Perro {
    Scanner scan = new Scanner(System.in);

    public PerroService() {
        super();
    }

    public PerroService(String nombre, Razas raza, int edad, Tamaños tamaño, String dueño) {
        super(nombre, raza, edad, tamaño, dueño);
    }

    public void crearPerro(String dueño) {
        System.out.println("Ingrese el nombre del perro");
        String nombre = scan.nextLine();
        setNombre(nombre);
        System.out.println("Ingrese la raza del perro");
        System.out.println("1. Cocker");
        System.out.println("2. Caniche");
        System.out.println("3. Batata");
        System.out.println("4. Chiquito");
        System.out.println("5. ChowChow");
        int raza = Integer.valueOf(scan.nextLine());
        if (raza == 1) {
            setRazas(Razas.Cocker);
        }
        if (raza == 2) {
            setRazas(Razas.Caniche);
        }
        if (raza == 3) {
            setRazas(Razas.Batata);
        }
        if (raza == 4) {
            setRazas(Razas.Chiquito);
        }
        if (raza == 5) {
            setRazas(Razas.ChowChow);
        }
        System.out.println("Ingrese la edad del perro");
        int edad = Integer.valueOf(scan.nextLine());
        setEdad(edad);
        System.out.println("Ingrese el tamaño del perro");
        System.out.println("1. Chico");
        System.out.println("2. Mediano");
        System.out.println("3. Grande");
        int tamanioPerro = Integer.valueOf(scan.nextLine());
        if (tamanioPerro == 1) {
            setTamaño(Tamaños.Chico);
        }
        if (tamanioPerro == 2) {
            setTamaño(Tamaños.Mediano);
        }
        if (tamanioPerro == 3) {
            setTamaño(Tamaños.Grande);
        }
        setDueño(dueño);

    }

    public void getPerro() {
        System.out.println(this);
    }

}
