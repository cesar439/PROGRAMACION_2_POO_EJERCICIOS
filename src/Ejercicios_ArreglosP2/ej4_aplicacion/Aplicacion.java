package Ejercicios_ArreglosP2.ej4_aplicacion;

public class Aplicacion {
    private String nombre;
    private String version;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }

    public void mostrarApp() {
        System.out.println("App: " + nombre + " | Versión: " + version);
    }
}