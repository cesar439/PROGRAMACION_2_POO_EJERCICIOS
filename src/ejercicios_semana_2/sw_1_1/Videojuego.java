package ejercicios_semana_2.sw_1_1;

public class Videojuego {
    // Atributos public
    public String nombre;
    public String genero;

    // Acceso por defecto
    String version;
    boolean activo;

    // Metodos public
    public void mostrarInformacion() {
        System.out.println("--- Información del Videojuego ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Versión: " + version);
        System.out.println("¿Está activo?: " + activo);
        System.out.println("----------------------------------");
    }

    public void iniciar() {
        activo = true;
        System.out.println(">>> Iniciando el videojuego: " + nombre);
    }

    // Acceso por defecto
    void cerrar() {
        activo = false;
        System.out.println(">>> Cerrando el videojuego: " + nombre);
    }

    void mostrarVersion() {
        System.out.println("La versión de " + nombre + " es: " + version);
    }
}