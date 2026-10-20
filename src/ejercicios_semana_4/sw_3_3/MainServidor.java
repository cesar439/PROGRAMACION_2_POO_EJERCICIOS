package ejercicios_semana_4.sw_3_3;

public class MainServidor {
    public static void main(String[] args) {
        Servidor s1 = new Servidor("ServidorWeb", "192.168.1.20");
        Servidor s2 = new Servidor("BaseDeDatos", "192.168.1.50");
        Servidor s3 = new Servidor("ServidorArchivos", "10.0.0.5");

        System.out.println("=== ESTADO INICIAL ===");
        System.out.println("Total servidores creados: " + Servidor.getTotalServidores());
        System.out.println("Servidores activos: " + Servidor.getServidoresActivos());

        System.out.println("\n=== ENCENDIENDO SERVIDORES ===");
        s1.activar();
        s2.activar();

        System.out.println("Servidores activos tras encender dos: " + Servidor.getServidoresActivos());

        System.out.println("\n=== PRUEBA DEL DESAFÍO (Trampas) ===");
        // Intentar activar el servidor 1 que ya está encendido (no debería sumar al contador)
        s1.activar();

        // Intentar desactivar el servidor 3 que ya está apagado (no debería restar al contador)
        s3.desactivar();

        System.out.println("\n=== ESTADO FINAL ===");
        System.out.println("Total servidores creados: " + Servidor.getTotalServidores());
        System.out.println("Servidores activos (debe seguir siendo 2): " + Servidor.getServidoresActivos());
    }
}