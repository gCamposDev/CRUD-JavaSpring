package com.gabriel.crud.services;

import com.gabriel.crud.entities.Carro;
import com.gabriel.crud.repositories.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public Carro criarCarro(Carro carro){
        return carroRepository.save(carro);
    }

    public List<Carro> listarCarros(){
        return carroRepository.findAll();
    }

    public Carro listarCarroPeloId(Long id){
        return carroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Carro não encontrado"));
    }

    public Carro atualizarCarroPeloId(Long id, Carro carro){
        Carro carroEntity = listarCarroPeloId(id);
        carroEntity.setModelo(carro.getModelo());
        carroEntity.setMarca(carro.getMarca());
        carroEntity.setAno(carro.getAno());
        carroEntity.setValor(carro.getValor());

        return carroRepository.save(carroEntity);
    }
}
