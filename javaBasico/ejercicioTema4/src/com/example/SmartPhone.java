package com.example;

public class SmartPhone extends SmartDevice{
    int memoriaRam = 16;

    public SmartPhone (String tipoDispositivo, String marca, double precio, String pantalla, String sistemaOperativo, int memoriaRam) {
        super(tipoDispositivo, marca, precio, pantalla, sistemaOperativo);
        this.memoriaRam = memoriaRam;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "memoriaRam=" + memoriaRam +
                ", tipoDispositivo='" + tipoDispositivo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", pantalla='" + pantalla + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }
}
