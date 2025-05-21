package com.java.clase;

public class Plato {
    private static int idCounter = 0;

    private int id;
    private String nombre;
    private float precio;

    public Plato(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
        this.id = ++idCounter;
    }

    public int getId(){
        return this.id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public float getPrecio(){
        return this.precio;
    }

    public void setPrecio(float precio){
        this.precio = precio;
    }

    public void logPlato(){
        System.out.println("Plato: " + this.id  + ", nombre: " + this.nombre + ", precio: " + this.precio);
    }
}

