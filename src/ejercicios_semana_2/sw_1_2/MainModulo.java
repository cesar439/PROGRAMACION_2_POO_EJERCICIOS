package ejercicios_semana_2.sw_1_2;

public class MainModulo {
    public static void main(String[] args) {
        Modulo login = new Modulo();
        Modulo inventario = new Modulo();
        Modulo reportes = new Modulo();

        login.nombre = "Login de Usuarios";
        login.lenguaje = "Java";
        login.version = "1.0";
        login.terminado = false;

        inventario.nombre = "Control de Inventario";
        inventario.lenguaje = "Python";
        inventario.version = "2.1";
        inventario.terminado = true;

        reportes.nombre = "Generador de Reportes";
        reportes.lenguaje = "C++";
        reportes.version = "1.5";
        reportes.terminado = false;

        System.out.println("=== PRUEBA MÓDULO LOGIN ===");
        login.mostrarInformacion();
        login.marcarTerminado();
        login.mostrarEstado();

        System.out.println("\n=== PRUEBA MÓDULO INVENTARIO ===");
        inventario.mostrarVersion();
        inventario.mostrarEstado();

        System.out.println("\n=== PRUEBA MÓDULO REPORTES ===");
        reportes.mostrarInformacion();
    }
}