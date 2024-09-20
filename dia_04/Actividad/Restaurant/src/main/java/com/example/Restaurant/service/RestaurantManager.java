package com.example.Restaurant.service;

import com.example.Restaurant.model.Mesa;
import com.example.Restaurant.model.Plato;
import com.example.Restaurant.repository.MesaRepository;
import com.example.Restaurant.repository.PlatoRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantManager {
    @Autowired
    private PlatoRepository platoRepository;

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


    @Autowired
    private MesaRepository mesaRepository;

    // Mesas
    public List<Mesa> getAllMesas(){
        return mesaRepository.findAll();
    }
    public Optional<Mesa> getMesaById(Long id){
        return mesaRepository.findById(id);
    }
    public Mesa saveMesa(Mesa mesa){
        return mesaRepository.save(mesa);
    }
    public void deleteMesa(Long id){
        mesaRepository.deleteById(id);
    }
    public Mesa updateMesa(Long id, Mesa mesaDetails){
        Mesa mesa = mesaRepository.findById(id).orElseThrow();
        mesa.setNumero_mesa(mesaDetails.getNumero_mesa());
        mesa.setOcupada(mesaDetails.getOcupada());
        return mesaRepository.save(mesa);
    }
    public Mesa updateMesaOcuppied(Long id, Mesa mesaDetails){
        Mesa mesa = mesaRepository.findById(id).orElseThrow();
        mesa.setOcupada(mesaDetails.getOcupada());
        return mesaRepository.save(mesa);
    }

}
