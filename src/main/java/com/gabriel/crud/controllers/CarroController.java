package com.gabriel.crud.controllers;

import com.gabriel.crud.entities.Carro;
import com.gabriel.crud.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @PostMapping
    public Carro criarCarro(@RequestBody Carro carro){
        return carroService.criarCarro(carro);
    }

    @GetMapping
    public List<Carro> listarCarros(){
        return carroService.listarCarros();
    }

    @GetMapping("/{id}")
    public Carro listarCarroPeloId(@PathVariable Long id){
        return carroService.listarCarroPeloId(id);

    }

    @PutMapping("/{id}")
    public Carro atualizarCarroPeloId(@PathVariable Long id, @RequestBody Carro carro){
        return carroService.atualizarCarroPeloId(id,carro);
    }


}
