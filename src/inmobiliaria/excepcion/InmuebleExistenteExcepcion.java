package inmobiliaria.excepcion;

public class InmuebleExistenteExcepcion extends RuntimeException {
    public InmuebleExistenteExcepcion(String message) {
        super(message);
    }
}
