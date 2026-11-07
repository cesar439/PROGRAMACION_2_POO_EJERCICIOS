package Ejercicios_ArreglosP2.ej2_proyecto;

public class Proyecto {
    private String nombre;
    private double presupuesto;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPresupuesto() { return presupuesto; }
    public void setPresupuesto(double presupuesto) {
        if(presupuesto >= 0) { this.presupuesto = presupuesto; }
        else { System.out.println("El presupuesto no puede ser negativo."); }
    }

    public void mostrarProyecto() {
        System.out.println("Proyecto: " + nombre + " | Presupuesto: $" + presupuesto);
    }
}