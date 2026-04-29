package com.cafeteria.servicio;

import com.cafeteria.modelo.Producto;
import java.util.List;

public class Cliente {
    // Escribimos su atributo
    private String nombre;

    // Constructor con el nombre
    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // toString para identificar al cliente
    @Override
    public String toString() {
        return "Cliente{" + "nombre='" + nombre + '\'' + '}';
    }

    // El cliente debe poder hacer el pedido
    public void hacerPedido(Cajero cajero, List<Producto> seleccion, Cocina cocina) {
        System.out.println("Usted " + nombre + " está entregando su orden al cajero.");

        // El objeto Cliente le envía un mensaje al objeto Cajero
        // Le pasa la lista de productos y el objeto cocina que se usará
        cajero.recibirPedido(seleccion, cocina);
    }
}