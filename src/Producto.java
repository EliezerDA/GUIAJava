public class Producto {
    private String nombre;
    private Double precio;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = (Double) precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

}
