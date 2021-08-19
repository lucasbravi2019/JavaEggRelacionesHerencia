package com.bravi.Ejercicio1.Model;

import com.bravi.Ejercicio1.Razas.Razas;
import com.bravi.Ejercicio1.Tamaños.Tamaños;

import java.util.Objects;

public class Perro {
    private String nombre;

    private Razas razas;

    private int edad;

    private Tamaños tamaño;

    private String dueño;

    public Perro() {
    }

    public Perro(String nombre, Razas razas, int edad, Tamaños tamaño, String dueño) {
        this.nombre = nombre;
        this.razas = razas;
        this.edad = edad;
        this.tamaño = tamaño;
        this.dueño = dueño;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Razas getRazas() {
        return this.razas;
    }

    public void setRazas(Razas razas) {
        this.razas = razas;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Tamaños getTamaño() {
        return this.tamaño;
    }

    public void setTamaño(Tamaños tamaño) {
        this.tamaño = tamaño;
    }

    public String getDueño() {
        return this.dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public Perro nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Perro razas(Razas razas) {
        setRazas(razas);
        return this;
    }

    public Perro edad(int edad) {
        setEdad(edad);
        return this;
    }

    public Perro tamaño(Tamaños tamaño) {
        setTamaño(tamaño);
        return this;
    }

    public Perro dueño(String dueño) {
        setDueño(dueño);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Perro)) {
            return false;
        }
        Perro perro = (Perro) o;
        return Objects.equals(nombre, perro.nombre) && Objects.equals(razas, perro.razas) && edad == perro.edad
                && Objects.equals(tamaño, perro.tamaño) && Objects.equals(dueño, perro.dueño);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, razas, edad, tamaño, dueño);
    }

    @Override
    public String toString() {
        return "{" + " nombre='" + getNombre() + "'" + ", razas='" + getRazas() + "'" + ", edad='" + getEdad() + "'"
                + ", tamaño='" + getTamaño() + "'" + ", dueño='" + getDueño() + "'" + "}";
    }

}
