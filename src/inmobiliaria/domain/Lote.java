package inmobiliaria.domain;

public class Lote extends Inmueble {


    public Lote(String direccion, Long valorVenta) {
        super(direccion, valorVenta);
    }

    @Override
    public String toString() {
        return "Lote{" +
                "direccion='" + getDireccion()+ '\'' +
                ", valorVenta=" + getValorVenta();
    }

}
