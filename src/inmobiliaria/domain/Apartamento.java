package inmobiliaria.domain;

public class Apartamento extends Inmueble implements Arrendable {
    public Apartamento(String direccion, Long valorVenta, Long valorArriendo, boolean arrendado) {
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
        return "Apartamento{" +
                "direccion='" + getDireccion()+ '\'' +
                ", valorVenta=" + getValorVenta()+
                ", valorArriendo=" + getValorArriendo() +
                ", arrendado=" + isArrendado() +
                '}';
    }
}
