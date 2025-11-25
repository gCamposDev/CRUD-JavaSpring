package com.gabriel.crud.dto;

import com.gabriel.crud.entities.Carro;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;

public class CarroResponseDTO {

    private Long id;
    private String modelo;
    private String marca;
    private Integer ano;
    private Double valor;

    public CarroResponseDTO(){

    }

    public CarroResponseDTO(Carro entity){
        BeanUtils.copyProperties(entity,this);
    }

    public Long getId(){return id;}

    public void setId(Long id){this.id = id;}

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public Integer getAno(){
        return ano;
    }

    public void setAno(Integer ano){
        this.ano = ano;
    }

    public Double getValor(){
        return valor;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }
}
