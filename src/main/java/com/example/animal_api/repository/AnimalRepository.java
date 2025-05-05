package com.example.animal_api.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.animal_api.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}