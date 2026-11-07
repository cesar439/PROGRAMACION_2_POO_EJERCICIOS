package Ejercicios_ArreglosP2.ej3_servicio;

public class Servicio {
    private String descripcion;
    private double costo;

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public double getCosto() { return costo; }
    public void setCosto(double costo) { this.costo = costo; }

    public void mostrarServicio() {
        System.out.println("Servicio: " + descripcion + " | Costo: $" + costo);
    }
}