package com.example.animal_api.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.animal_api.model.Animal;
import com.example.animal_api.model.Veterinario;
import com.example.animal_api.repository.VeterinarioRepository;

@RestController
@RequestMapping("/veterinarios")
public class VeterinarioController {
    
    private final VeterinarioRepository repository;
    
    public VeterinarioController(VeterinarioRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping
    public List<Veterinario> getAll() {
        return repository.findAll();
    }
    
    @GetMapping("/{id}/animales")
    public List<Animal> getAnimalesByVeterinario(@PathVariable Long id) {
        Veterinario vet = repository.findById(id).orElse(null);
        return vet != null ? vet.getAnimales() : null;
    }
    
    @PostMapping
    public Veterinario create(@RequestBody Veterinario veterinario) {
        return repository.save(veterinario);
    }
}