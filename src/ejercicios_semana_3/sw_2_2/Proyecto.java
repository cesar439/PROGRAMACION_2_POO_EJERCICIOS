package ejercicios_semana_3.sw_2_2;

public class Proyecto {
    // Atributos privados
    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    // Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProgreso() {
        return this.progreso;
    }

    public void setProgreso(int progreso) {
        if (progreso >= 0 && progreso <= 100) {
            this.progreso = progreso;
        } else {
            System.out.println("Error: El progreso debe estar únicamente entre 0 y 100.");
        }
    }

    public String getResponsable() {
        return this.responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public boolean isTerminado() {
        return this.terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    // Método avanzar con validación de tope 100%
    public void avanzar(int porcentaje) {
        if (porcentaje > 0) {
            int nuevoProgreso = this.progreso + porcentaje;

            if (nuevoProgreso >= 100) {
                this.progreso = 100;
                this.terminado = true;
                System.out.println(">>> Proyecto '" + this.nombre + "' completado al 100%.");
            } else {
                this.progreso = nuevoProgreso;
                System.out.println(">>> Proyecto '" + this.nombre + "' avanzó al " + this.progreso + "%.");
            }
        } else {
            System.out.println("Error: El avance debe ser mayor a 0.");
        }
    }
}