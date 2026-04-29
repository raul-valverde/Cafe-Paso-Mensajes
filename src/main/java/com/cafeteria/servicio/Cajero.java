package com.cafeteria.servicio;

import com.cafeteria.modelo.Pedido;
import com.cafeteria.modelo.Producto;

import java.sql.SQLOutput;

public class Cajero {
    //Escribimos su atributo
    private String nombre;

    //Constructo vacio
    public Cajero() {
    }

    //Constructo con el nombre
    public Cajero(String nombre) {
        this.nombre = nombre;
    }

    //Getter and setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Tostring
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cajero{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void recibirPedido(List<Producto> lista, Cocina cocina) {
        System.out.println("[CAJERO] " + nombre + " registrando productos...");

    // Crea el pedido
    Pedido pedidoActual = new Pedido();
        for (
    Producto p : lista) {
        pedidoActual.agregarProducto(p);
    }

    // PASO DE MENSAJE: Envía el objeto a la cocina
        System.out.println("[CAJERO] Pasando pedido a la cocina.");
        cocina.prepararPedido(pedidoActual);

        notificarCliente();
    }
    public void notificarCliente(){
        System.out.println("Cajero para el cliente: su pedido esta en barra");
    }
}

