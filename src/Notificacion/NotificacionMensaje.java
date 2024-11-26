package Notificacion;

public class NotificacionMensaje implements Notificacion{
    @Override
    public void enviar(String mensaje) {
        System.out.println("Nuevo Mensaje: " + mensaje);
    }
}
