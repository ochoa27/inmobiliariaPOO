package inmobiliaria.app;

import inmobiliaria.domain.*;
import inmobiliaria.excepcion.InmuebleExistenteExcepcion;
import inmobiliaria.excepcion.InmuebleNoArrendableExcepcion;
import inmobiliaria.excepcion.InmuebleNoValidoExcepcion;
import inmobiliaria.excepcion.ValorArriendoMayorExcepcion;

public class agenciaApp {
    public static void main(String[] args) {
        try {
            Agencia inmobiliaria1 =new Agencia("inmobiliariaUco");
            Inmueble casa1=new Casa("cra52",52000L,12000L,false);
            Inmueble apartamento1=new Apartamento("carrera53",38000L,15000L,true);
            Inmueble lote1=new Lote("carrera54",80000L);
            Inmueble apartamento2=new Apartamento("carrera333",53000L,15000L,false);
            Inmueble casa2=new Casa("carrera58",53000L,15000L,false);
            Inmueble casa3=new Casa("carrera71",53000L,15000L,true);
            Inmueble lote2=new Lote("carrera1",580000L);
            Inmueble casa4=new Casa("carrera33",2000L,5000L,true);
//            System.out.println(lote1.getDireccion());

            inmobiliaria1.agregarInmueble(casa1);
            inmobiliaria1.agregarInmueble(apartamento1);
            inmobiliaria1.agregarInmueble(lote1);
            inmobiliaria1.agregarInmueble(apartamento2);
            inmobiliaria1.agregarInmueble(casa2);
            inmobiliaria1.agregarInmueble(casa3);
            inmobiliaria1.agregarInmueble(lote2);

//            inmobiliaria1.agregarInmueble(casa4);
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
            inmobiliaria1.devolver(lote2);
            inmobiliaria1.listaInmueblesParaArrendar();
            System.out.println("separacion de las dos listas");
            inmobiliaria1.listainmueblesArrendados();
            System.out.println("separacion de la lista total de inmuebles");
            inmobiliaria1.ListaDeInmueblesTotales();


        }catch (InmuebleNoArrendableExcepcion excepcion){
            excepcion.printStackTrace();
            System.out.println(excepcion.getMessage());
        } catch (InmuebleExistenteExcepcion excepcion){
            excepcion.printStackTrace();
            System.out.println(excepcion.getMessage());
        }catch (ValorArriendoMayorExcepcion excepcion){
            excepcion.printStackTrace();
            System.out.println(excepcion.getMessage());
        } catch (InmuebleNoValidoExcepcion excepcion){
            excepcion.printStackTrace();
            System.out.println(excepcion.getMessage());
        }



    }





}
