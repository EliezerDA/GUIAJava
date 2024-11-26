package Notificacion;

public class ServicioNotificacion {
    private Notificacion tiponotificacion;

    public ServicioNotificacion(Notificacion tiponotificacion){
        this.tiponotificacion = tiponotificacion;
    }

    public void enviarMensaje(String mensaje){
        tiponotificacion.enviar(mensaje);
    }

}
