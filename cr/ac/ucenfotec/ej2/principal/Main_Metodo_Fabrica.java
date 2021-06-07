package cr.ac.ucenfotec.ej2.principal;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_Metodo_Fabrica {
    private static Gestor gGestor = new Gestor();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ejecutarPrograma();
    }

    public static void ejecutarPrograma(){
        int opcion = 0;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            try {
                ejecutarOpcion(opcion);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch(InputMismatchException e) {
                System.out.println("No ingreso ningún valor o presionó el botón de enter varias veces");
            }
        } while (opcion != 6);
    }

    private static void ejecutarOpcion(int opcion) throws SQLException {
        switch (opcion){
            case 1:
                gGestor.nuevoMilitante("Piloto");
                System.out.println("Piloto agregado");
                break;
            case 2:
                gGestor.nuevoMilitante("Doctor");
                System.out.println("Doctor agregado");
                break;
            case 3:
                gGestor.nuevoMilitante("Infanteria");
                System.out.println("Infantería agregada");
                break;
            case 4:
                gGestor.nuevoMilitante("Artillero");
                System.out.println("Artillero agregado");
                break;
            case 5:
                imprimir();
                break;
            case 6:
                break;
        }

    }

    /************************************************************
     * Metodo:		imprimir
     *
     * Descripción:	Esta funcion imprime los datos de un objeto
     * 				de tipo militante.
     *
     * Parametros:
     *
     * @return:		N/A
     *************************************************************/
    public static void mostrarMenu() {
        System.out.println("Ingrese una opción para continuar:");
        System.out.println("1. Agregar piloto");
        System.out.println("2. Agregar doctor");
        System.out.println("3. Agregar infantería");
        System.out.println("4. Agregar artillero");
        System.out.println("5. Obtener datos de los militantes");
        System.out.println("6. Salir");
    }

    /************************************************************
     * Metodo:		imprimir
     *
     * Descripción:	Esta funcion imprime los datos de un objeto
     * 				de tipo militante.
     *
     * Parametros:
     *
     * @return:		N/A
     *************************************************************/
    private static void imprimir() {
        System.out.println(gGestor.obtenerDatos());
    }
}
