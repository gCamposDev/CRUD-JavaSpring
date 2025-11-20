package entities;

import jakarta.persistence.*;

@Entity
@Table(name="Carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private String marca;
    private Integer ano;
    private Double valor;

    public Carro(){

    }

    public Carro(Long id, String modelo, String marca, Integer ano, Double valor){
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
    }

    public Long getId(){
        return id;
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


