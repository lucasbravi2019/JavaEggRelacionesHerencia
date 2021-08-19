package com.bravi.Ejercicio1.Service;

import java.util.Scanner;

import com.bravi.Ejercicio1.Model.Perro;
import com.bravi.Ejercicio1.Model.Persona;

public class PersonaService extends Persona {
    Scanner scan = new Scanner(System.in);

    public PersonaService() {
        super();
    }

    public PersonaService(String nombre, String apellido, int edad, int documento, Perro perro) {
        super(nombre, apellido, edad, documento, perro);
    }

    public void crearPersona() {
        System.out.println("Ingrese el nombre de la persona");
        setNombre(scan.nextLine());
        System.out.println("Ingrese el apellido de la persona");
        setApellido(scan.nextLine());
        System.out.println("Ingrese la edad de la persona");
        setEdad(Integer.valueOf(scan.nextLine()));
        System.out.println("Ingrese el documento de la persona");
        setDocumento(Integer.valueOf(scan.nextLine()));
    }

    public void agregarPerro(Perro perro) {
        perro.setDueño(getNombre());
        setPerro(perro);
    }
}
