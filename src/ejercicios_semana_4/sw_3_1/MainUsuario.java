package ejercicios_semana_4.sw_3_1;

public class MainUsuario {
    public static void main(String[] args) {
        // Se crean cuatro usuarios como pide el ejemplo
        Usuario u1 = new Usuario("jperez", "jperez@correo.com");
        Usuario u2 = new Usuario("klopez", "klopez@correo.com");
        Usuario u3 = new Usuario("mgarcia", "mgarcia@correo.com");
        Usuario u4 = new Usuario("atorres", "atorres@correo.com");

        // Resultado esperado
        System.out.println("Total de usuarios: " + Usuario.getContadorUsuarios());

        // Comprobación adicional para ver que los IDs son únicos
        System.out.println("ID del usuario 1: " + u1.getId() + " (" + u1.getUsername() + ")");
        System.out.println("ID del usuario 4: " + u4.getId() + " (" + u4.getUsername() + ")");
    }
}