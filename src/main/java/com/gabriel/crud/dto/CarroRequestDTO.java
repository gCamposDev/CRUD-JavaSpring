package com.gabriel.crud.dto;

import com.gabriel.crud.entities.Carro;
import org.springframework.beans.BeanUtils;

public class CarroRequestDTO {

    private String modelo;
    private String marca;
    private Integer ano;
    private Double valor;

    public CarroRequestDTO(){

    }

    public CarroRequestDTO(Carro entity){
        BeanUtils.copyProperties(entity,this);
    }


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
