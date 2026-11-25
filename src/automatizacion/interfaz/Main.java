package automatizacion.interfaz;

import automatizacion.modelo.*;
import automatizacion.gestion.EstacionControl;

public class Main {
    public static void main(String[] args) {
        EstacionControl estacion = new EstacionControl();

        // 1. sensores, actuadores y el controlador
        Dispositivo s1 = new Sensor("S01", "Sensor Temp", true, 24.5, "°C");
        Dispositivo s2 = new Sensor("S02", "Sensor Presión", false, 1.2, "atm");

        Dispositivo a1 = new Actuador("A01", "Válvula Principal", true, 50.0, 2.5);
        Dispositivo a2 = new Actuador("A02", "Motor Cinta", true, 100.0, 5.0);

        Dispositivo c1 = new Controlador("C01", "PLC Central", true, 16);

        // 2. Agregarlos a la Estación de Control (Colección con subtipos mezclados)
        estacion.agregarDispositivo(s1);
        estacion.agregarDispositivo(s2);
        estacion.agregarDispositivo(a1);
        estacion.agregarDispositivo(a2);
        estacion.agregarDispositivo(c1);

        // 3. Imprimir mostrarInformacion() de todos
        System.out.println("--- LISTA DE DISPOSITIVOS ---");
        System.out.println(estacion.mostrarDispositivos());

        // 4. Conteo de activos
        System.out.println("--- ESTADO GENERAL ---");
        System.out.println("Total de dispositivos activos: " + estacion.contarActivos());

        // 5. Búsqueda por código
        System.out.println("\n--- BÚSQUEDA ---");
        String codBuscado = "A01";
        Dispositivo encontrado = estacion.buscarDispositivo(codBuscado);
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.mostrarInformacion());
        } else {
            System.out.println("Dispositivo con código " + codBuscado + " no encontrado.");
        }
    }
}