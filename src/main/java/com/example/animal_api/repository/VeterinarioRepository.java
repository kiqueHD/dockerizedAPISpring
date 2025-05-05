package com.example.animal_api.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.animal_api.model.Veterinario;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Long> {
}