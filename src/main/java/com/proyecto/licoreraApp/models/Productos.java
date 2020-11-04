package com.proyecto.licoreraApp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Productos {

    @Id
    private int IdProductos;
    @Column(name = "Nombre_producto", length = 50)
    private String Nombre_producto;
    @Column(name = "Valor_producto")
    private int Valor_producto;
    @Column(name = "Ganancia")
    private int Ganancia;
    @Column(name = "Valor_venta")
    private int Valor_venta;

    public int getIdProductos() {
        return IdProductos;
    }

    public void setIdProductos(int idProductos) {
        IdProductos = idProductos;
    }

    public String getNombre_producto() {
        return Nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        Nombre_producto = nombre_producto;
    }

    public int getValor_producto() {
        return Valor_producto;
    }

    public void setValor_producto(int valor_producto) {
        Valor_producto = valor_producto;
    }

    public int getGanancia() {
        return Ganancia;
    }

    public void setGanancia(int ganancia) {
        Ganancia = ganancia;
    }

    public int getValor_venta() {
        return Valor_venta;
    }

    public void setValor_venta(int valor_venta) {
        Valor_venta = valor_venta;
    }
}
