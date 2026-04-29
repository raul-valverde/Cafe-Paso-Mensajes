package com.cafeteria.main;

import com.cafeteria.modelo.Producto;
import com.cafeteria.servicio.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instanciamos los objetos (Paso de mensajes entre ellos)
        Cliente cliente1 = new Cliente("Benedicto");
        Cajero cajero1 = new Cajero("Chepito");
        Cocina cocina1 = new Cocina();

        //Creamos la lista de productos usando ArrayList
        List<Producto> carrito = new ArrayList<>();
        carrito.add(new Producto("Café", 39.99));
        carrito.add(new Producto("Churro", 34.99));

        //Iniciamos la simulación
        System.out.println("Cafeteria LOS MENSAJES");

        // la cadena de mensajes
        cliente1.hacerPedido(cajero1, carrito, cocina1);

    }
}