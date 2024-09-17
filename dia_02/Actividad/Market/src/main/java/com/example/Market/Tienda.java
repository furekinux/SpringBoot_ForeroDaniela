package com.example.Market;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private ArrayList<Prenda> items;

    // Constructores
    public Tienda(String nombre) {
        this.nombre = nombre;
        items= new ArrayList<>();
    }
    public Tienda(String nombre, ArrayList<Prenda> items) {
        this.nombre = nombre;
        this.items = items;
    }

    // Getters y Setters
    public ArrayList<Prenda> getItems() {
        return items;
    }
    public void setItems(ArrayList<Prenda> items) {
        this.items = items;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addProduct(Prenda prenda){
        items.add(prenda);
    }

    public void readItems(){
        for (int i = 0; i < items.size(); i++) {
            System.out.println("--> Item "+i+"    "+items.get(i).getNombre()+"\n" +
                               "    Talla: "+items.get(i).getTalla()+"  Tipo: "+items.get(i).getTipo()+"\n");
        }
    }
}
