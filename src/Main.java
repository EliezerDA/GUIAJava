public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Teclado", 45.00);
        Producto producto1 = new Producto("Mouse", 25.50);
        Producto producto2 = new Producto("Audifonos", 10.40);
        Producto producto3 = new Producto("Mousepad", 5.30);
        Producto producto4 = new Producto("Silla Gamer", 125.99);


        CalculoImpuestos calculoImpuestos = new CalculoImpuestos();

        Double precioConImpuesto = calculoImpuestos.calcularimpuesto(producto.getPrecio());
        Double precioConImpuesto1 = calculoImpuestos.calcularimpuesto(producto1.getPrecio());
        Double precioConImpuesto2 = calculoImpuestos.calcularimpuesto(producto2.getPrecio());
        Double precioConImpuesto3 = calculoImpuestos.calcularimpuesto(producto3.getPrecio());
        Double precioConImpuesto4 = calculoImpuestos.calcularimpuesto(producto4.getPrecio());


        EnvioDeNotificaciones notificaciones = new EnvioDeNotificaciones();

        System.out.println("Estos Productos Cambiaron de Precio: ");
        notificaciones.notificarCambioPrecio(producto.getNombre(), precioConImpuesto);
        notificaciones.notificarCambioPrecio(producto1.getNombre(), precioConImpuesto1);
        notificaciones.notificarCambioPrecio(producto2.getNombre(), precioConImpuesto2);
        notificaciones.notificarCambioPrecio(producto3.getNombre(), precioConImpuesto3);
        notificaciones.notificarCambioPrecio(producto4.getNombre(), precioConImpuesto4);


        System.out.println("\n Se realizo la compra de estos productos: ");
        notificaciones.notificarCompra(producto.getNombre(), precioConImpuesto);
        notificaciones.notificarCompra(producto1.getNombre(), precioConImpuesto1);
        notificaciones.notificarCompra(producto2.getNombre(), precioConImpuesto2);
        notificaciones.notificarCompra(producto3.getNombre(), precioConImpuesto3);
        notificaciones.notificarCompra(producto4.getNombre(), precioConImpuesto4);



    }
}
