package com.gabriel.crud.repositories;

import com.gabriel.crud.entities.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
