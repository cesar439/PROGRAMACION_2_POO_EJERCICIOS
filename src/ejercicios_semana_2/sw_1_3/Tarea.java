package ejercicios_semana_2.sw_1_3;

public class Tarea {
    // Atributos public
    public String titulo;
    public String responsable;

    // Acceso por defecto
    double horasEstimadas;
    boolean completada;

    // Metodos public
    public void mostrarInformacion() {
        System.out.println("--- Información de la Tarea ---");
        System.out.println("Título: " + titulo);
        System.out.println("Responsable: " + responsable);
        System.out.println("Horas estimadas: " + horasEstimadas);
        System.out.println("¿Completada?: " + completada);
        System.out.println("-------------------------------");
    }

    public void completar() {
        completada = true;
        System.out.println(">>> La tarea '" + titulo + "' ha sido completada.");
    }

    // Acceso por defecto
    void mostrarResponsable() {
        System.out.println("El responsable de '" + titulo + "' es: " + responsable);
    }

    void mostrarEstado() {
        System.out.println("Estado de '" + titulo + "' (Completada): " + completada);
    }
}