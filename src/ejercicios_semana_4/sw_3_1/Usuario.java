package ejercicios_semana_4.sw_3_1;

public class Usuario {
    // Atributos de instancia
    private int id;
    private String username;
    private String correo;
    private boolean activo;

    // Atributo estático (compartido por toda la clase)
    private static int contadorUsuarios = 0;

    // Constructor requerido
    public Usuario(String username, String correo) {
        contadorUsuarios++;             // 1. Incrementar contador
        this.id = contadorUsuarios;     // 2. Asignar valor al id
        this.username = username;       // 3. Inicializar username
        this.correo = correo;           // 4. Inicializar correo
        this.activo = true;             // 5. Establecer automáticamente en true
    }

    // Getters y Setters
    public int getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isActivo() {
        return this.activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Getter estático para consultar el total sin crear objetos
    public static int getContadorUsuarios() {
        return contadorUsuarios;
    }
}