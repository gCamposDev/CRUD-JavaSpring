package com.gabriel.crud.controllers;

import com.gabriel.crud.dto.CarroRequestDTO;
import com.gabriel.crud.dto.CarroResponseDTO;
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
    public CarroResponseDTO criarCarro(@RequestBody CarroRequestDTO carroRequestDTO){
        return carroService.criarCarro(carroRequestDTO);
    }

    @GetMapping
    public List<CarroResponseDTO> listarCarros(){
        return carroService.listarCarros();
    }

    @GetMapping("/{id}")
    public CarroResponseDTO listarCarroPeloId(@PathVariable Long id){
        return carroService.listarCarroPeloId(id);

    }

    @PutMapping("/{id}")
    public CarroResponseDTO atualizarCarroPeloId(@PathVariable Long id, @RequestBody CarroRequestDTO carro){
        return carroService.atualizarCarroPeloId(id,carro);
    }

    @DeleteMapping("/{id}")
    public void deletarCarroPeloId(@PathVariable Long id){
        carroService.deletarCarroPeloId(id);
    }


}
