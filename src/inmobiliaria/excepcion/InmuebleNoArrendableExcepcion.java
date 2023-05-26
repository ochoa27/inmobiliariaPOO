package inmobiliaria.excepcion;

public class InmuebleNoArrendableExcepcion extends RuntimeException{
    public InmuebleNoArrendableExcepcion(String message) {
        super(message);
    }
}
