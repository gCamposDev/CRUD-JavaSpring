package com.gabriel.crud.controllers;

import com.gabriel.crud.entities.Carro;
import com.gabriel.crud.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @PostMapping
    public Carro createCarro(@RequestBody Carro carro){
        return carroService.createCarro(carro);
    }
}
