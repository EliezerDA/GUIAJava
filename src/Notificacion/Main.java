package Notificacion;

public class Main {
    public static void main(String[] args) {
        NotificacionEmail email = new NotificacionEmail();
        NotificacionMensaje mensaje = new NotificacionMensaje();

        ServicioNotificacion servicioEmail = new ServicioNotificacion(email);
        ServicioNotificacion servicioMensaje = new ServicioNotificacion(mensaje);

        servicioEmail.enviarMensaje("Mensaje Enviado por Email");
        servicioMensaje.enviarMensaje("Mensaje nuevo SMS");

    }
}
