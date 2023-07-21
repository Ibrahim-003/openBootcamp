package sistemaNotificacion;

public class Main {
    public static void main(String[] args) {
        SistemaDeNotificacion sistema = new SistemaDeNotificacion();

        Usuario suscriptor1 = new Usuario("Suscriptor 1");
        Usuario suscriptor2 = new Usuario("Suscriptor 2");
        Usuario suscriptor3 = new Usuario("Suscriptor 3");

        sistema.agregarUsuario(suscriptor1);
        sistema.agregarUsuario(suscriptor2);
        sistema.agregarUsuario(suscriptor3);

        Notificacion notificacion = new Notificacion("!Nueva promocion disponible!");

        sistema.mandarNotificacion(notificacion);

    }
}
