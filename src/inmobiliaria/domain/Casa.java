package inmobiliaria.domain;

public class Casa extends Inmueble implements Arrendable {

    public Casa(String direccion, Long valorVenta, Long valorArriendo, boolean arrendado) {
        super(direccion, valorVenta, valorArriendo, arrendado);
    }

    @Override
    public boolean arrendar() {
        return false;
    }

    @Override
    public boolean devolver() {
        return false;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + getDireccion()+ '\'' +
                ", valorVenta=" + getValorVenta()+
                ", valorArriendo=" + getValorArriendo() +
                ", arrendado=" + isArrendado() +
                '}';
    }
}
