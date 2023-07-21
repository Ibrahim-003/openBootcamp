package org.example;

public class Configuracion {
    private static Configuracion instancia;
    private String idioma;
    private String tema;

    private Configuracion() {
        idioma = "es";
        tema = "claro";
    }

    public static Configuracion getInstance() {
        if (instancia == null) {
            instancia = new Configuracion();
        }

        return instancia;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
