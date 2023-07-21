package sistemaNotificacion;

public class Usuario implements Observer{

    private String name;

    public Usuario(String name) {
        this.name = name;
    }
    @Override
    public void actualizar(Notificacion notificacion) {
        System.out.println(this.name + " recibio una notificacion = " + notificacion.getMensaje());
    }
}
