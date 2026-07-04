
package com.mycompany.gremio;
import java.util.Scanner;

public class Menu {

    private Scanner sc;
    private Gremio gremio;

    public Menu() {
        sc = new Scanner(System.in);
        gremio = new Gremio("Gremio de Artesanos", "Bogotá", 1995);
    }

    public void iniciar() {

        int opcion;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Agregar miembro");
            System.out.println("2. Listar miembros");
            System.out.println("3. Agregar producto");
            System.out.println("4. Listar productos");
            System.out.println("5. Mostrar detalles de un producto");
            System.out.println("0. Salir");

            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    agregarMiembro();
                    break;

                case 2:
                    listarMiembros();
                    break;

                case 3:
                    agregarProducto();
                    break;

                case 4:
                    listarProductos();
                    break;

                case 5:
                    mostrarProducto();
                    break;

                case 0:
                    System.out.println("Hasta luego.");
                    break;

                default:
                    System.out.println("Opción inválida.");

            }

        } while (opcion != 0);

    }

    private void agregarMiembro() {

        // Aquí irá la lógica para crear un Maestro,
        // Oficial o Aprendiz.

    }

    private void listarMiembros() {

        for (Miembro miembro : gremio.listarMiembros()) {
            System.out.println(miembro.getNombre());
        }

    }

    private void agregarProducto() {

        // Aquí irá la lógica para crear un Producto.

    }

    private void listarProductos() {

        for (Producto producto : gremio.listarProductos()) {
            System.out.println(producto.getNombre());
        }

    }

    private void mostrarProducto() {

        // Buscar un producto y llamar a mostrarDetalles().

    }

}
