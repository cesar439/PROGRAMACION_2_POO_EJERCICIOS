package Examen_p1;

public class AlertaSistema {
    private int identificador;
    private String descripcion;
    private int prioridad;
    private static int contadorAlertas;

    public AlertaSistema(int identificador, String descripcion) {
        if (identificador > 0 && descripcion !=null && !descripcion.trim().isEmpty()){
            this.identificador = identificador;
            this.descripcion = descripcion;
            this.prioridad = 1;
            contadorAlertas++;
        } else {
            System.out.println("ERROR DE ALERTA");
        }
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public static int getContadorAlertas() {
        return contadorAlertas;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion != null && !descripcion.trim().isEmpty()){
        this.descripcion = descripcion;
    }
}
public boolean aumentarPrioridad(){
    if (this.prioridad < 5) {
        this.prioridad++;
        return true;
    }
    return  false;
}
 public boolean esUrgente(){
    return this.prioridad >=4;
    }
}
