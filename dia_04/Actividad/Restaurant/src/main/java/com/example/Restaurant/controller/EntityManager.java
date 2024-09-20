package com.example.Restaurant.controller;

import com.example.Restaurant.model.Mesa;
import com.example.Restaurant.model.Plato;
import com.example.Restaurant.service.RestaurantManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurant")
public class EntityManager {

    @Autowired
    private RestaurantManager restaurantManager;

    // ························· PLATOS ·························
    @GetMapping("/platos")
    public List<Plato> getAllPlatos(){
        return restaurantManager.getAllPlatos();
    }

    @GetMapping("/platos/{id}")
    public Plato getPlatoById(@PathVariable Long id){
        return restaurantManager.getPlatoById(id).orElseThrow();
    }

    @PostMapping("/platos")
    public Plato createPlato(@RequestBody Plato plato){
        return restaurantManager.savePlato(plato);
    }

    @PutMapping("/platos/{id}")
    public Plato updatePlato(@PathVariable Long id,@RequestBody Plato plato){
        return restaurantManager.updatePlato(id,plato);
    }

    @DeleteMapping("/platos/{id}")
    public void deletePlato(@PathVariable Long id){
        restaurantManager.deletePlato(id);
    }


    // ························· MESAS ·························
    @GetMapping("/mesas")
    public List<Mesa> getAllMesas(){
        return restaurantManager.getAllMesas();
    }

    @GetMapping("/mesas/{id}")
    public Mesa getMesaById(@PathVariable Long id){
        return restaurantManager.getMesaById(id).orElseThrow();
    }

    @PostMapping("/mesas")
    public Mesa createMesa(@RequestBody Mesa mesa){
        return restaurantManager.saveMesa(mesa);
    }

    @PutMapping("/mesas/{id}")
    public Mesa updateMesa(@PathVariable Long id,@RequestBody Mesa mesa){
        return restaurantManager.updateMesa(id, mesa);
    }

    @DeleteMapping("/mesas/{id}")
    public void deleteMesa(@PathVariable Long id){
        restaurantManager.deleteMesa(id);
    }

}
