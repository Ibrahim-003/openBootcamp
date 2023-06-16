package com.example;

import java.util.Arrays;

public class SmartWatch extends SmartDevice {
    String[] conectividad = new String[2];

    public SmartWatch(String tipoDispositivo, String marca, double precio, String pantalla, String sistemaOperativo, String[] conectividad) {
        super(tipoDispositivo, marca, precio, pantalla, sistemaOperativo);
        this.conectividad = conectividad;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "conectividad=" + Arrays.toString(conectividad) +
                ", tipoDispositivo='" + tipoDispositivo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", pantalla='" + pantalla + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }
}
