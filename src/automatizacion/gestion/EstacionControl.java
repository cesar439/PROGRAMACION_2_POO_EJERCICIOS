package automatizacion.gestion;

import automatizacion.modelo.Dispositivo;
import java.util.ArrayList;

public class EstacionControl {
    private ArrayList<Dispositivo> dispositivos;

    public EstacionControl() {
        dispositivos = new ArrayList<>();
    }

    public void agregarDispositivo(Dispositivo dispositivo) {
        if (dispositivo != null) {
            dispositivos.add(dispositivo);
        }
    }

    public Dispositivo buscarDispositivo(String codigo) {
        for (Dispositivo d : dispositivos) {
            if (d.getCodigo().equalsIgnoreCase(codigo)) {
                return d;
            }
        }
        return null;
    }

    public int contarActivos() {
        int contador = 0;
        for (Dispositivo d : dispositivos) {
            if (d.isActivo()) {
                contador++;
            }
        }
        return contador;
    }

    public String mostrarDispositivos() {
        if (dispositivos.isEmpty()) {
            return "No hay dispositivos registrados.";
        }
        StringBuilder sb = new StringBuilder();
        for (Dispositivo d : dispositivos) {

            sb.append(d.mostrarInformacion()).append("\n");
            sb.append(" -> Operación: ").append(d.obtenerEstadoOperacion()).append("\n");
        }
        return sb.toString();
    }
}