package ejercicios_semana_3.sw_2_2;

public class MainProyecto {
    public static void main(String[] args) {
        Proyecto p1 = new Proyecto();
        p1.setNombre("Tutor Adaptativo IA");
        p1.setResponsable("César Yunga");
        p1.setProgreso(60);
        p1.setTerminado(false);

        System.out.println("--- ESTADO DEL PROYECTO ---");
        System.out.println("Proyecto: " + p1.getNombre());
        System.out.println("Responsable: " + p1.getResponsable());
        System.out.println("Progreso inicial: " + p1.getProgreso() + "%");

        System.out.println("\n--- AVANZANDO PROYECTO ---");
        p1.avanzar(20); // Sube a 80%
        p1.avanzar(30); // Intenta subir a 110%, pero se detiene en 100% y se termina

        System.out.println("\n--- VERIFICACIÓN FINAL ---");
        System.out.println("Progreso final: " + p1.getProgreso() + "%");
        System.out.println("¿Terminado?: " + p1.isTerminado());

        System.out.println("\n--- PRUEBA DE VALIDACIONES CON SETTER ---");
        p1.setProgreso(-10); // Dará error
        p1.setProgreso(150); // Dará error
    }
}