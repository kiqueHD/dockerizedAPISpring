package com.example.animal_api.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.animal_api.model.Animal;
import com.example.animal_api.repository.AnimalRepository;

@RestController
@RequestMapping("/animales")
public class AnimalController {
    
    private final AnimalRepository repository;
    
    public AnimalController(AnimalRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping
    public List<Animal> getAll() {
        return repository.findAll();
    }
    
    @GetMapping("/{id}")
    public Animal getById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }
    
    @PostMapping
    public Animal create(@RequestBody Animal animal) {
        return repository.save(animal);
    }
}