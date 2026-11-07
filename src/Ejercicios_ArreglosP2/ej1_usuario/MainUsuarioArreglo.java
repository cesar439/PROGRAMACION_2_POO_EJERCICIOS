package Ejercicios_ArreglosP2.ej1_usuario;

import java.util.Scanner;

public class MainUsuarioArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 3;
        Usuario[] usuarios = new Usuario[MAX];
        int opcion;

        do {
            System.out.println("\n--- MENÚ USUARIOS (ARREGLO COMPLETO) ---");
            System.out.println("1. Llenar todo el arreglo");
            System.out.println("2. Mostrar todos los usuarios");
            System.out.println("3. Activar todos los usuarios");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    for (int i = 0; i < usuarios.length; i++) {
                        System.out.println("\nUsuario " + (i + 1) + ":");
                        usuarios[i] = new Usuario();
                        System.out.print("Ingrese username: ");
                        usuarios[i].setUsername(sc.nextLine());
                        System.out.print("Ingrese correo: ");
                        usuarios[i].setCorreo(sc.nextLine());
                        System.out.print("Ingrese nivel: ");
                        usuarios[i].setNivel(Integer.parseInt(sc.nextLine()));
                        usuarios[i].setActivo(false);
                    }
                    break;
                case 2:
                    for (int i = 0; i < usuarios.length; i++) {
                        if (usuarios[i] != null) {
                            System.out.println("\n[Índice " + i + "] User: " + usuarios[i].getUsername() +
                                    " | Correo: " + usuarios[i].getCorreo() +
                                    " | Nivel: " + usuarios[i].getNivel() +
                                    " | Activo: " + usuarios[i].isActivo());
                        } else {
                            System.out.println("\n[Índice " + i + "] (Vacío)");
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < usuarios.length; i++) {
                        if (usuarios[i] != null) { usuarios[i].activar(); }
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