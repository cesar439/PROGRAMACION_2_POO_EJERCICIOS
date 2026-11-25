package automatizacion.modelo;

public class Controlador extends Dispositivo {
    private int numeroEntradas;

    public Controlador(String codigo, String nombre, boolean activo, int numeroEntradas) {
        super(codigo, nombre, activo);
        this.numeroEntradas = numeroEntradas;
    }

    @Override
    public String obtenerEstadoOperacion() {
        return "Procesando señales de entrada y tomando decisiones.";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " | Entradas disponibles: " + numeroEntradas;
    }
}