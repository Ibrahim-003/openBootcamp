package org.example;

public class Main {
    public static void main(String[] args) {
//        Los patrones de diseño son soluciones probadas y comúnmente utilizadas para problemas
//        recurrentes en el diseño de software. Dentro de los patrones de diseño hay 3 subclases
//        siendo estas: Patrones creacionales, patrones estructurales y patrones de comportamiento
//        el uso de cualquiera dependera del alcance de la aplicacion asi como de su arquitectura



        Application app1 = Application.getInstance();
        Application app2 = Application.getInstance();

        app1.run();
        app2.run();

    }
}