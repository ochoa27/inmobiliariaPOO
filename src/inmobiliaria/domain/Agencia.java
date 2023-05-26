package inmobiliaria.domain;

import inmobiliaria.excepcion.InmuebleNoArrendableExcepcion;
import inmobiliaria.excepcion.InmuebleExistenteExcepcion;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String nombre;
    private List<Inmueble> inmuebles=new ArrayList<>();

    public Agencia(String nombre) {
        this.nombre = nombre;
    }

    public void agregarInmueble(Inmueble inmueble){
        this.verificarInmuebleExistente(inmueble);
        this.inmuebles.add(inmueble);
    };

    public boolean arrendar(Inmueble inmuebleArrendable) {
        this.verificarInmuebleArrendable(inmuebleArrendable);
        boolean respuestaArrendamiento;
//        if (inmuebleArrendable instanceof Arrendable)
            if(inmuebleArrendable.isArrendado()==false) {
                inmuebleArrendable.setArrendado(true);
                respuestaArrendamiento = true;
            }else respuestaArrendamiento=false;
//        else respuestaArrendamiento=false;

        return respuestaArrendamiento;
    };

    public boolean devolver( Inmueble inmuebleADevolver) {
        boolean respuestaAdevolver;
        if ((inmuebleADevolver instanceof Arrendable)&&(inmuebleADevolver.isArrendado() == true)){
                inmuebleADevolver.setArrendado(false);
                respuestaAdevolver = false;
        }respuestaAdevolver=true;
        return  respuestaAdevolver;
    };

    public boolean vender(Inmueble inmuebleAVender){
        if((inmuebleAVender instanceof Arrendable) && (inmuebleAVender.isArrendado()==true)) {
            System.out.println("el inmueble no se ha podido vender por que se encuentra arrendado");
        } else
            System.out.println("el inmueble se puede vender");
        return  true;
    };
    public List<Inmueble> listaInmueblesParaArrendar(){
        List<Inmueble> arrendablesDisponibles=new ArrayList<>();
        for (Inmueble item:inmuebles) {
            if ((item instanceof Arrendable)&&(item.isArrendado()==false)){
                arrendablesDisponibles.add(item);
                System.out.println(item.toString());
            }
        }
        return  arrendablesDisponibles ;
    };
    public List<Inmueble> listainmueblesArrendados(){
        List<Inmueble>inmueblesArrendados=new ArrayList<>();
        for(Inmueble item:inmuebles){
            if ((item instanceof Arrendable)&&(item.isArrendado()==true)){
                inmueblesArrendados.add(item);
                System.out.println(item.toString());
            }
        }
        return inmueblesArrendados;
    }

    public void verificarInmuebleArrendable(Inmueble inmueble){
        if (!(inmueble instanceof Arrendable)){
            throw new InmuebleNoArrendableExcepcion("La propiedad " + inmueble.getDireccion() + " no es arrendable!");
        }
    }
    public void verificarInmuebleExistente(Inmueble inmueble){
        for (Inmueble item:inmuebles) {
            if(item.getDireccion().equals(inmueble.getDireccion())){
                throw new InmuebleExistenteExcepcion("la propiedad ya esta creada");
            }


        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(List<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }
}