package ejercicios_semana_4.sw_3_2;

public class Aplicacion {
    // Atributos de instancia
    private int id;
    private String nombre;
    private String version;
    private boolean ejecutando;

    // Atributo estático
    private static int totalAplicaciones = 0;

    // Constructor requerido
    public Aplicacion(String nombre, String version) {
        totalAplicaciones++;              // 1. Incrementar totalAplicaciones
        this.id = totalAplicaciones;      // 2. Utilizar valor para generar id
        this.nombre = nombre;             // 3. Inicializar nombre
        this.version = version;           // 4. Inicializar version
        this.ejecutando = false;          // 5. Establecer ejecutando en false
    }

    // Métodos requeridos
    public void iniciar() {
        this.ejecutando = true;
        System.out.println(">>> Aplicación '" + this.nombre + "' INICIADA.");
    }

    public void cerrar() {
        this.ejecutando = false;
        System.out.println(">>> Aplicación '" + this.nombre + "' CERRADA.");
    }

    public static int getTotalAplicaciones() {
        return totalAplicaciones;
    }

    // Getters
    public int getId() { return this.id; }
    public String getNombre() { return this.nombre; }
    public String getVersion() { return this.version; }
    public boolean isEjecutando() { return this.ejecutando; }
}