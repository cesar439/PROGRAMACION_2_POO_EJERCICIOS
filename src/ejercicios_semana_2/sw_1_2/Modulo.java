package ejercicios_semana_2.sw_1_2;

public class Modulo {
    // Atributos public
    public String nombre;
    public String lenguaje;

    // Acceso por defecto
    String version;
    boolean terminado;

    // Metodos public
    public void mostrarInformacion() {
        System.out.println("--- Información del Módulo ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Lenguaje: " + lenguaje);
        System.out.println("Versión: " + version);
        System.out.println("¿Está terminado?: " + terminado);
        System.out.println("------------------------------");
    }

    public void marcarTerminado() {
        terminado = true;
        System.out.println(">>> El módulo " + nombre + " ha sido marcado como terminado.");
    }

    // Acceso por defecto
    void mostrarEstado() {
        System.out.println("Estado del módulo " + nombre + " (Terminado): " + terminado);
    }

    void mostrarVersion() {
        System.out.println("La versión del módulo " + nombre + " es: " + version);
    }
}