package com.example.tema4.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "laptops")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private Double precio;
    private LocalDate añoFabricacion;

    public Laptop() {
    }

    public Laptop(Long id, String marca, String modelo, Double precio, LocalDate añoFabricacion) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.añoFabricacion = añoFabricacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public LocalDate getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(LocalDate añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
}
