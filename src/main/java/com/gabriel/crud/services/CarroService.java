package com.gabriel.crud.services;

import com.gabriel.crud.dto.CarroRequestDTO;
import com.gabriel.crud.dto.CarroResponseDTO;
import com.gabriel.crud.entities.Carro;
import com.gabriel.crud.repositories.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public CarroResponseDTO criarCarro(CarroRequestDTO carroRequestDTO){
        Carro carro = new Carro();
        carro.setModelo(carroRequestDTO.getModelo());
        carro.setMarca(carroRequestDTO.getMarca());
        carro.setValor(carroRequestDTO.getValor());
        carro.setAno(carroRequestDTO.getAno());

        carro = carroRepository.save(carro);

        CarroResponseDTO carroResponseDTO = new CarroResponseDTO(carro);

        return carroResponseDTO;
    }

    public List<CarroResponseDTO> listarCarros(){
        List<Carro> result = carroRepository.findAll();
        List<CarroResponseDTO> carroResponseDTOList = result.stream().map(x -> new CarroResponseDTO(x)).toList();
        return carroResponseDTOList;
    }

    public CarroResponseDTO listarCarroPeloId(Long id){
        Carro carro = carroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Carro não encontrado"));

        CarroResponseDTO carroResponseDTO = new CarroResponseDTO(carro);

        return carroResponseDTO;

    }

    public CarroResponseDTO atualizarCarroPeloId(Long id, CarroRequestDTO carro){
        Carro carroEntity = carroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Carro não encontrado"));
        carroEntity.setModelo(carro.getModelo());
        carroEntity.setMarca(carro.getMarca());
        carroEntity.setAno(carro.getAno());
        carroEntity.setValor(carro.getValor());

        carroEntity = carroRepository.save(carroEntity);

        CarroResponseDTO carroResponseDTO = new CarroResponseDTO(carroEntity);

        return carroResponseDTO;
    }

    public void deletarCarroPeloId(Long id){
        carroRepository.deleteById(id);
    }
}
