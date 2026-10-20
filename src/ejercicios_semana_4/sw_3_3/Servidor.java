package ejercicios_semana_4.sw_3_3;

public class Servidor {
    // Atributos
    private int id;
    private String nombre;
    private String direccionIP;
    private boolean activo;

    // Atributos estáticos
    private static int totalServidores = 0;
    private static int servidoresActivos = 0;

    // Constructor requerido
    public Servidor(String nombre, String direccionIP) {
        totalServidores++;              // 1. Incrementar totalServidores
        this.id = totalServidores;      // 2. Asignar contador a id
        this.nombre = nombre;           // 3. Inicializar nombre
        this.direccionIP = direccionIP; // 4. Inicializar direccionIP
        this.activo = false;            // 5. Establecer activo = false
        // IMPORTANTE: NO incrementa servidoresActivos aquí porque nace apagado
    }

    // Desafío: Métodos con validación estricta del contador de activos
    public void activar() {
        if (!this.activo) { // Solo entra si estaba apagado
            this.activo = true;
            servidoresActivos++; // Incrementa solo si estaba apagado
            System.out.println(">>> Servidor '" + this.nombre + "' ha sido ENCENDIDO.");
        } else {
            System.out.println("--- El servidor '" + this.nombre + "' ya se encontraba encendido.");
        }
    }

    public void desactivar() {
        if (this.activo) { // Solo entra si estaba activo
            this.activo = false;
            servidoresActivos--; // Disminuye solo si estaba activo
            System.out.println(">>> Servidor '" + this.nombre + "' ha sido APAGADO.");
        } else {
            System.out.println("--- El servidor '" + this.nombre + "' ya se encontraba apagado.");
        }
    }

    // Getters estáticos para comprobación
    public static int getTotalServidores() {
        return totalServidores;
    }

    public static int getServidoresActivos() {
        return servidoresActivos;
    }

    // Getters de instancia
    public int getId() { return this.id; }
    public String getNombre() { return this.nombre; }
    public String getDireccionIP() { return this.direccionIP; }
    public boolean isActivo() { return this.activo; }
}