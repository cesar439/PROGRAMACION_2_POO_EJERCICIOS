package automatizacion.modelo;

public class Sensor extends Dispositivo {
    private double lectura;
    private String unidad;

    public Sensor(String codigo, String nombre, boolean activo, double lectura, String unidad) {
        super(codigo, nombre, activo); // Inicializa los atributos de la clase padre
        this.lectura = lectura;
        this.unidad = unidad;
    }

    @Override
    public String obtenerEstadoOperacion() {
        return "Sensando variables del entorno.";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " | Lectura: " + lectura + " " + unidad;
    }
}