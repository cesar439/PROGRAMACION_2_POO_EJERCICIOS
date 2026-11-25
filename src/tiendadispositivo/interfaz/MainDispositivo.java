package tiendadispositivo.interfaz;

import tiendadispositivo.modelo.CamaraSeguridad;
import tiendadispositivo.modelo.Computador;

public class MainDispositivo {
    static void main() {
        Computador c1 = new Computador(1,"hp",32);
        CamaraSeguridad cs1 = new CamaraSeguridad(1,"patito",1028);

        System.out.println(c1.prender());
        if(c1.ejecutarPrograma("Word")){
            System.out.println("Actuamente se encuentra ejecutando el programa");
        }else{
            System.out.println("No se ha podido ejecutar el programa");
        }
        System.out.println(); System.out.println(c1.apagar());
        System.out.println(c1.mostrarInformacion());
        if(c1.ejecutarPrograma("Word")){
            System.out.println("Actuamente se encuentra ejecutando el programa");
        }else{
            System.out.println("No se ha podido ejecutar el programa");
        }

        System.out.println(cs1.apagar());
        System.out.println(cs1.prender());
        if(cs1.grabarVideo()){
            System.out.println("Se ha grabado y guarda con éxito el video");
        }else{
            System.out.println("No se ha podido grabar");
        }
        System.out.println(cs1.mostrarInformacion());

    }
}