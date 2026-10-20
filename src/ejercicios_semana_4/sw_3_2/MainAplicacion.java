package ejercicios_semana_4.sw_3_2;

public class MainAplicacion {
    public static void main(String[] args) {
        Aplicacion app1 = new Aplicacion("SistemaVentas", "1.0");
        Aplicacion app2 = new Aplicacion("ControlInventario", "2.1");

        System.out.println("Total de aplicaciones creadas: " + Aplicacion.getTotalAplicaciones());

        System.out.println("\n--- PRUEBA DE ESTADOS ---");
        System.out.println("Estado inicial de " + app1.getNombre() + " (Ejecutando): " + app1.isEjecutando());

        app1.iniciar();
        System.out.println("Estado actual de " + app1.getNombre() + " (Ejecutando): " + app1.isEjecutando());

        app1.cerrar();
        System.out.println("Estado final de " + app1.getNombre() + " (Ejecutando): " + app1.isEjecutando());
    }
}