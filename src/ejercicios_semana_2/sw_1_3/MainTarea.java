package ejercicios_semana_2.sw_1_3;

public class MainTarea {
    public static void main(String[] args) {
        Tarea t1 = new Tarea();
        t1.titulo = "Auditoría de ciberseguridad";
        t1.responsable = "César";
        t1.horasEstimadas = 5.5;
        t1.completada = false;

        Tarea t2 = new Tarea();
        t2.titulo = "Diseño de interfaz gráfica";
        t2.responsable = "Kenia";
        t2.horasEstimadas = 8.0;
        t2.completada = false;

        Tarea t3 = new Tarea();
        t3.titulo = "Configuración del servidor";
        t3.responsable = "Bruno";
        t3.horasEstimadas = 3.5;
        t3.completada = false;

        System.out.println("=== ESTADO INICIAL ===");
        t1.mostrarInformacion();
        t2.mostrarInformacion();
        t3.mostrarInformacion();

        System.out.println("\n=== COMPLETANDO TAREA 1 ===");
        t1.completar();

        System.out.println("\n=== COMPROBACIÓN DE RESULTADOS FINALES ===");
        t1.mostrarEstado();
        t2.mostrarEstado();
        t3.mostrarEstado();
    }
}