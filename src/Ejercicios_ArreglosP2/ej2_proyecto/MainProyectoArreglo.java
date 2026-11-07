package Ejercicios_ArreglosP2.ej2_proyecto;

import java.util.Scanner;

public class MainProyectoArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 3;
        Proyecto[] proyectos = new Proyecto[MAX];
        int indice = 0;
        int opcion;

        do {
            System.out.println("\n--- MENÚ PROYECTOS (INGRESO 1 A 1) ---");
            System.out.println("1. Ingresar proyecto (1 en 1)");
            System.out.println("2. Mostrar todos los proyectos registrados");
            System.out.println("3. Consultar proyecto por índice específico");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    if (indice < MAX) {
                        proyectos[indice] = new Proyecto();
                        System.out.print("Ingrese nombre del proyecto: ");
                        proyectos[indice].setNombre(sc.nextLine());
                        System.out.print("Ingrese presupuesto: ");
                        proyectos[indice].setPresupuesto(Double.parseDouble(sc.nextLine()));
                        indice++;
                        System.out.println("Proyecto registrado con éxito.");
                    } else {
                        System.out.println("No hay más memoria disponible en el arreglo.");
                    }
                    break;
                case 2:
                    System.out.println("\n--- LISTA DE PROYECTOS ---");
                    for (int i = 0; i < indice; i++) {
                        System.out.print("Índice [" + i + "] -> ");
                        proyectos[i].mostrarProyecto();
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el índice que desea consultar (0 al " + (MAX - 1) + "): ");
                    int pos = Integer.parseInt(sc.nextLine());
                    if (pos >= 0 && pos < indice) {
                        System.out.println("Datos en el índice " + pos + ":");
                        proyectos[pos].mostrarProyecto();
                    } else {
                        System.out.println("Índice inválido o posición vacía.");
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