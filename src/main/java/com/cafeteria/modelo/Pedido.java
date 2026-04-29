package com.cafeteria.modelo;

import java.util.List;

public class Pedido {
    //Atributos solicitados
    private List<Producto> productos;
    private String estado;

    //Agregamos constructor vacio
    public Pedido() {
    }

    //Constructor con todos
    public Pedido(List<Producto> productos, String estado) {
        this.productos = productos;
        this.estado = estado;
    }

    //Getter and setter
    public List<Producto> getProductos() {//Mostrará los productos porque los retornara como la lista

        return productos;
    }
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getEstado() {//muestra el estado (lo retorna como valor String)

        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    //toString

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pedido{");
        sb.append("productos=").append(productos);
        sb.append(", estado='").append(estado).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //Pasos de mensaje
    public void agregarProducto(Producto p){//Agregamos productos a la lista y el paso no nos reotrna nada
        this.productos.add(p);
    }

    public void cambiarEstado(String nuevoEstado){//Agrega un nuevo estado y no retorna nada
        this.estado= nuevoEstado;
    }

    }
