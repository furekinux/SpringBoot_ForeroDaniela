package com.example.Market;

public class Prenda implements Producto {
    private String nombre;
    private String talla;
    private String tipo;

    public Prenda() {
    }

    public Prenda(String nombre, String talla, String tipo) {
        this.nombre = nombre;
        this.talla = talla;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String detalles() {
        return "Este producto es una prenda de tipo "+getTipo();
    }
}
