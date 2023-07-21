package sistemaNotificacion;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeNotificacion implements Suject {
    private List<Usuario> usuarios;

    public SistemaDeNotificacion() {
        usuarios = new ArrayList<>();
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    @Override
    public void notificarUsuario(Notificacion notificacion) {
        for (Usuario usuario : usuarios) {
            usuario.actualizar(notificacion);
        }
    }

    public void mandarNotificacion(Notificacion notificacion) {
        notificarUsuario(notificacion);
    }
}
