package inmobiliaria.domain;

public abstract class Inmueble {

    private String direccion;

    private Long valorVenta;
    private Long valorArriendo;
    private boolean arrendado;

    public Inmueble(String direccion, Long valorVenta, Long valorArriendo, Boolean arrendado) {
        this.direccion = direccion;
        this.valorVenta = valorVenta;
        this.valorArriendo = valorArriendo;
        this.arrendado = arrendado;
    }

    public Inmueble(String direccion, Long valorVenta) {
        this.direccion = direccion;
        this.valorVenta = valorVenta;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "direccion='" + direccion + '\'' +
                ", valorVenta=" + valorVenta +
                ", valorArriendo=" + valorArriendo +
                ", arrendado=" + arrendado +
                '}';
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(Long valorVenta) {
        this.valorVenta = valorVenta;
    }

    public Long getValorArriendo() {
        return valorArriendo;
    }

    public void setValorArriendo(Long valorArriendo) {
        this.valorArriendo = valorArriendo;
    }

    public boolean isArrendado() {
        return arrendado;
    }

    public void setArrendado(boolean arrendado) {
        this.arrendado = arrendado;
    }
};

