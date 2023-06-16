package com.example;

public class SmartDevice {
    String tipoDispositivo;
    String marca;
    double precio;
    String pantalla;
    String sistemaOperativo;

    public SmartDevice(String tipoDispositivo, String marca, double precio, String pantalla, String sistemaOperativo){
        this.tipoDispositivo = tipoDispositivo;
        this.marca = marca;
        this.precio = precio;
        this.pantalla = pantalla;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getPrecio() {
        String result = "El precio del " + this.tipoDispositivo + " es $/" + this.precio;

        return result;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "tipoDispositivo='" + tipoDispositivo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", pantalla='" + pantalla + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }
}
