package inmobiliaria.app;

import inmobiliaria.domain.*;
import inmobiliaria.excepcion.InmuebleExistenteExcepcion;
import inmobiliaria.excepcion.InmuebleNoArrendableExcepcion;

public class agenciaApp {
    public static void main(String[] args) {
        try {
            Agencia inmobiliaria1 =new Agencia("inmobiliariaUco");
            Inmueble casa1=new Casa("cra52",52000L,12000L,false);
            Inmueble apartamento1=new Apartamento("carrera53",38000L,15000L,true);
            Inmueble lote1=new Lote("carrera54",80000L);
            Inmueble apartamento2=new Apartamento("carrera53",53000L,15000L,false);
            Inmueble casa2=new Casa("carrera58",53000L,15000L,false);
            Inmueble casa3=new Casa("carrera71",53000L,15000L,true);
            Inmueble lote2=new Lote("carrera1",580000L);
//            System.out.println(lote1.getDireccion());

            inmobiliaria1.agregarInmueble(casa1);
            inmobiliaria1.agregarInmueble(apartamento1);
            inmobiliaria1.agregarInmueble(lote1);
//            inmobiliaria1.agregarInmueble(apartamento2);
            inmobiliaria1.agregarInmueble(casa2);
            inmobiliaria1.agregarInmueble(casa3);
//            inmobiliaria1.arrendar(lote1);

            for (Inmueble item:inmobiliaria1.getInmuebles()) {
                System.out.println("la agencia tine a:"+item.getDireccion());

            }

            if(inmobiliaria1.arrendar(casa1)==true){
                System.out.println("la casa se ha puesto en arriendo");
                System.out.println(casa1.isArrendado());
            }


            if(inmobiliaria1.arrendar(apartamento1)==true){
                System.out.println("el apartamento  se ha puesto en arriendo");
                System.out.println(apartamento1.isArrendado());
            }else System.out.println("el apartamento no se ha podido arrendar");



            inmobiliaria1.vender(lote1);
            inmobiliaria1.vender(casa1);
            inmobiliaria1.vender(apartamento1);
            inmobiliaria1.devolver(casa1);
            inmobiliaria1.devolver(apartamento1);
            inmobiliaria1.listaInmueblesParaArrendar();
            System.out.println("separacion de las dos listas");
            inmobiliaria1.listainmueblesArrendados();


        }catch (InmuebleNoArrendableExcepcion excepcion){
            excepcion.printStackTrace();
            System.out.println("El inmueble no es arrendable");
        } catch (InmuebleExistenteExcepcion excepcion){
            excepcion.printStackTrace();
            System.out.println("inmueble ya existente");
            System.out.println(excepcion.getMessage());
        }



    }





}
