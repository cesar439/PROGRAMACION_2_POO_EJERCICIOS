package Examen_p1;

public class MainAlertaSistema {
    static void main() {
        AlertaSistema a1 = new AlertaSistema(10, "ERROR DE CONEXION");
        System.out.println("Prioridad inicial: " + a1.getPrioridad());

        System.out.println("Aumento:" + a1.aumentarPrioridad() + " Prioridad: " + a1.getPrioridad());

        a1.aumentarPrioridad();
        a1.aumentarPrioridad();
        System.out.println("Es urgente (4): " + a1.esUrgente());

        a1.aumentarPrioridad();
        System.out.println("Prioridad maxima: " + a1.getPrioridad());
        System.out.println("Intentar aumentar más: " + a1.aumentarPrioridad());

        a1.setDescripcion("");
        System.out.println("Descripcion conversada: " + a1.getDescripcion());

        System.out.println("Total alertas: " + AlertaSistema.getContadorAlertas());
    }
}
