package ejercicios_semana_2.sw_1_1;

public class MainVideojuego {
        public static void main(String[] args) {
                // Creación de 3 videojuegos manteniendo sus propios valores[cite: 17]
                Videojuego v1 = new Videojuego();
                v1.nombre = "Minecraft";
                v1.genero = "Supervivencia";
                v1.version = "Cobblemon Modpack";
                v1.activo = false;

                Videojuego v2 = new Videojuego();
                v2.nombre = "League of Legends";
                v2.genero = "MOBA";
                v2.version = "14.2";
                v2.activo = false;

                Videojuego v3 = new Videojuego();
                v3.nombre = "Albion Online";
                v3.genero = "MMORPG";
                v3.version = "Paths to Glory";
                v3.activo = false;

                System.out.println("=== PRUEBA V1 ===");
                v1.mostrarInformacion();
                v1.iniciar(); // Cambia el estado a true
                v1.mostrarVersion();

                System.out.println("\n=== PRUEBA V2 ===");
                v2.iniciar();
                v2.mostrarInformacion();
                v2.cerrar(); // Lo vuelve a apagar

                System.out.println("\n=== PRUEBA V3 ===");
                v3.mostrarInformacion();
        }
}
