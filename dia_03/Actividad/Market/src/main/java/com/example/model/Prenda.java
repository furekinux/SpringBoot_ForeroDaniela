package com.example.model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Prenda implements Producto {
    private String nombre;
    private String talla;
    private String tipo;

    @Override
    public String detalles() {
        return "Este producto es una prenda de tipo "+getTipo();
    }
}
