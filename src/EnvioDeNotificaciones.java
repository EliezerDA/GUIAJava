public class EnvioDeNotificaciones {

    public void notificarCambioPrecio(String nombre, Double nuevoprecio){
        System.out.println("El producto: "+ nombre + " cambio de precio a: "+ nuevoprecio);
    }

    public void notificarCompra(String nombre, Double nuevoprecio){
        System.out.println("La compra del producto: " + nombre + " fue realizada con el precio: "+ nuevoprecio);
    }
}
