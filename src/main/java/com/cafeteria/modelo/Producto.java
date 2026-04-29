package com.cafeteria.modelo;

public class Producto {
    //Atributos solicitados en el PDF
    private String nombre;
    private double precio;

    //Constructor vacio
    public Producto() {
    }

    //Constuctor completo
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getter and Setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //toString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Producto: ");
        sb.append(" nombre = ' ").append(nombre).append('\'');
        sb.append(" ,  precio = ").append(precio);
        return sb.toString();
    }
}

