package com.example.model;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;


@Getter
@Setter
@ToString
@AllArgsConstructor
public class Tienda {
    private String nombre;
    private ArrayList<Prenda> items;

    public Tienda(String nombre) {
        this.nombre = nombre;
        items= new ArrayList<>();
    }

    public void addProduct(Prenda prenda){
        items.add(prenda);
    }

    public void rmvProduct(int index){
        try {
            items.remove(index);
        }catch (Exception e){
            System.out.println("No se encontró el índice.\n");
        }
    }

    public void readItems(){
        for (int i = 0; i < items.size(); i++) {
            System.out.println("--> Item "+i+"    "+items.get(i).getNombre()+"\n" +
                               "    Talla: "+items.get(i).getTalla()+"  Tipo: "+items.get(i).getTipo()+"\n");
        }
    }

}
