package com.cafeteria.servicio;

import com.cafeteria.modelo.Pedido;

public class Cocina {
    public void prepararPedido(Pedido pedido){
        System.out.println("Cocina recibio tu pedido....");
        //cambia el estado y lo manda a imprimir
        pedido.cambiarEstado("En preparacion");
        System.out.println("La cocina dice que tu pedido esta: "+pedido.getEstado());
        //cambia el estado y lo manda a imprimir
        pedido.cambiarEstado("Listo y Bello");
        System.out.println("Cocina dice que el pedido esta termiando, :)");
    }
}
