package ejercicios_semana_3.sw_2_1;

public class MainUsuario {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();

        // Uso de setters correctos
        u1.setUsername("Kaiman_p");
        u1.setCorreo("cesar@udla.edu.ec");
        u1.setNivel(5);
        u1.setActivo(false);

        System.out.println("--- DATOS DEL USUARIO ---");
        System.out.println("Username: " + u1.getUsername());
        System.out.println("Correo: " + u1.getCorreo());
        System.out.println("Nivel: " + u1.getNivel());
        System.out.println("Activo inicial: " + u1.isActivo());

        System.out.println("\n--- ACCIONES ---");
        u1.activar();
        System.out.println("Activo actual: " + u1.isActivo());

        System.out.println("\n--- PRUEBA DE VALIDACIONES ---");
        u1.setUsername(""); // Dará error
        u1.setNivel(-2);    // Dará error
    }
}