package automatizacion.modelo;

public class Actuador extends Dispositivo {
    private double posicion;
    private double potencia;

    public Actuador(String codigo, String nombre, boolean activo, double posicion, double potencia) {
        super(codigo, nombre, activo);
        this.posicion = posicion;
        this.potencia = potencia;
    }

    @Override
    public String obtenerEstadoOperacion() {
        return "Ejecutando acción física en el sistema.";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " | Posición: " + posicion + " | Potencia: " + potencia + "W";
    }
}