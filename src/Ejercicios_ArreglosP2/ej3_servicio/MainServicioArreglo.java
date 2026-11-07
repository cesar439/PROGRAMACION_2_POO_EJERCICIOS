package Ejercicios_ArreglosP2.ej3_servicio;

import java.util.Scanner;

public class MainServicioArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 3;
        Servicio[] servicios = new Servicio[MAX];
        int indice = 0;
        int opcion;

        do {
            System.out.println("\n--- MENÚ SERVICIOS ---");
            System.out.println("1. Ingresar cantidad de servicios");
            System.out.println("2. Mostrar todos los servicios");
            System.out.println("3. Actualizar costo de un servicio por índice");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos servicios desea ingresar?: ");
                    int cantidad = Integer.parseInt(sc.nextLine());
                    if ((indice + cantidad) <= MAX) {
                        int contador = 0;
                        while (contador < cantidad) {
                            servicios[indice] = new Servicio();
                            System.out.print("Ingrese la descripción del servicio: ");
                            servicios[indice].setDescripcion(sc.nextLine());
                            System.out.print("Ingrese el costo del servicio: ");
                            servicios[indice].setCosto(Double.parseDouble(sc.nextLine()));
                            indice++;
                            contador++;
                        }
                        System.out.println("Servicios ingresados correctamente.");
                    } else {
                        System.out.println("No hay suficiente espacio en el arreglo.");
                    }
                    break;
                case 2:
                    for (int i = 0; i < indice; i++) {
                        System.out.print("Índice [" + i + "] -> ");
                        servicios[i].mostrarServicio();
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el índice del servicio a modificar (0 a " + (MAX - 1) + "): ");
                    int pos = Integer.parseInt(sc.nextLine());
                    if (pos >= 0 && pos < indice) {
                        System.out.print("Ingrese el nuevo costo: ");
                        servicios[pos].setCosto(Double.parseDouble(sc.nextLine()));
                        System.out.println("Costo actualizado con éxito.");
                    } else {
                        System.out.println("Posición inválida o vacía.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
        sc.close();
    }
}