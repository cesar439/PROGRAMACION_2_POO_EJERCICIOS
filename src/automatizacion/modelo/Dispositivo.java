package automatizacion.modelo;

public class Dispositivo {
    private String codigo;
    private String nombre;
    private boolean activo;

    public Dispositivo(String codigo, String nombre, boolean activo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.activo = activo;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean isActivo() {
        return activo;
    }

    public String obtenerEstadoOperacion() {
        return "Estado general del dispositivo.";
    }

    public String mostrarInformacion() {
        return "Código: " + codigo + " | Nombre: " + nombre + " | Activo: " + (activo ? "Sí" : "No");
    }
}