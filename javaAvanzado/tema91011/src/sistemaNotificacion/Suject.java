package sistemaNotificacion;

public interface Suject {
    void agregarUsuario(Usuario usuario);
    void eliminarUsuario(Usuario usuario);
    void notificarUsuario(Notificacion notificacion);
}
