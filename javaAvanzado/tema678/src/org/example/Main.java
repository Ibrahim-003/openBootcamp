package org.example;

public class Main {
    public static void main(String[] args) {

        Configuracion config1 = Configuracion.getInstance();
        Configuracion config2 = Configuracion.getInstance();

        // Comprobando que ambas variables apunten a la misma instancia
        System.out.println(config1 == config2);

        // Modificar la configuracion en una instancia afecta a la otra
        config1.setTema("Oscuro");
        System.out.println(config2.getTema());

    }
}