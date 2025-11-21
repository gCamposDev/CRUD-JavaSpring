package com.gabriel.crud.services;

import com.gabriel.crud.entities.Carro;
import com.gabriel.crud.repositories.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public Carro createCarro(Carro carro){
        return carroRepository.save(carro);
    }
}
