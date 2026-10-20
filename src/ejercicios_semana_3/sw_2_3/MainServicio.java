package ejercicios_semana_3.sw_2_3;

public class MainServicio {
    public static void main(String[] args) {
        Servicio s1 = new Servicio();
        s1.setNombre("Base de Datos MySQL");
        s1.setPuerto(3306);
        s1.setActivo(false);
        s1.setCantidadPeticiones(0);

        System.out.println("--- INFORMACIÓN DEL SERVICIO ---");
        System.out.println("Servicio: " + s1.getNombre());
        System.out.println("Puerto: " + s1.getPuerto());

        System.out.println("\n--- COMPORTAMIENTO ---");
        s1.iniciar();
        s1.registrarPeticion(); // Aumenta a 1
        s1.registrarPeticion(); // Aumenta a 2
        s1.detener();

        System.out.println("\n--- ESTADO DESPUÉS DE OPERAR ---");
        System.out.println("Peticiones totales: " + s1.getCantidadPeticiones());
        System.out.println("¿Está activo?: " + s1.isActivo());

        System.out.println("\n--- PRUEBA DE VALIDACIONES ---");
        s1.setNombre("   "); // Dará error por espacios en blanco
        s1.setPuerto(-80);   // Dará error
        s1.setCantidadPeticiones(-5); // Dará error
    }
}