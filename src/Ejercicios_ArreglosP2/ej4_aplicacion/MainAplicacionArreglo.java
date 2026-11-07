package Ejercicios_ArreglosP2.ej4_aplicacion;

import java.util.Scanner;

public class MainAplicacionArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 3;
        Aplicacion[] apps = new Aplicacion[MAX];
        int opcion;

        do {
            System.out.println("\n--- MENÚ APLICACIONES ---");
            System.out.println("1. Llenar todas las aplicaciones (Arreglo completo)");
            System.out.println("2. Mostrar todas las aplicaciones");
            System.out.println("3. Buscar aplicación por índice específico");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    for (int i = 0; i < apps.length; i++) {
                        apps[i] = new Aplicacion();
                        System.out.print("Nombre de la app " + (i + 1) + ": ");
                        apps[i].setNombre(sc.nextLine());
                        System.out.print("Versión de la app " + (i + 1) + ": ");
                        apps[i].setVersion(sc.nextLine());
                    }
                    System.out.println("Aplicaciones registradas con éxito.");
                    break;
                case 2:
                    for (int i = 0; i < apps.length; i++) {
                        if (apps[i] != null) {
                            System.out.print("Índice [" + i + "] -> ");
                            apps[i].mostrarApp();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Ingrese índice a buscar (0 a 2): ");
                    int idx = Integer.parseInt(sc.nextLine());
                    if (idx >= 0 && idx < apps.length && apps[idx] != null) {
                        apps[idx].mostrarApp();
                    } else {
                        System.out.println("Posición vacía o índice incorrecto.");
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