package com.example.Restaurant.service;

import com.example.Restaurant.model.Plato;
import com.example.Restaurant.repository.MesaRepository;
import com.example.Restaurant.repository.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class RestaurantManager {
    @Autowired
    private PlatoRepository platoRepository;

    @Autowired
    private MesaRepository mesaRepository;

    // Platos
    public List<Plato> getAllPlatos(){
        return platoRepository.findAll();
    }
    public Optional<Plato> getPlatoById(Long id){
        return platoRepository.findById(id);
    }
    public Plato savePlato(Plato plato){
        return platoRepository.save(plato);
    }
    public void deletePlato(Long id){
        platoRepository.deleteById(id);
    }
    public Plato updatePlato(Long id, Plato platoDetails){
        Plato plato = platoRepository.findById(id).orElseThrow();
        plato.setNombre(platoDetails.getNombre());
        plato.setPrecio(platoDetails.getPrecio());
        plato.setDisponibilidad(platoDetails.getDisponibilidad());
        return platoRepository.save(plato);
    }

    // Mesas
}
