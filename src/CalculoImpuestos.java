public class CalculoImpuestos {
    Double impuesto = (Double) 0.13;

    public Double calcularimpuesto(Double precio){
        return (Double) (precio + (precio * impuesto));
    }
}
