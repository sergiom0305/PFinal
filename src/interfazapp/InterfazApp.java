/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfazapp;

/**
 *
 * @author jerso
 */
import java.util.Scanner;
import interfazapp.Sistema;
import interfazapp.ArbolBinario;
import java.util.Comparator;
import java.util.PriorityQueue;


public class InterfazApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Sistema sistema = new Sistema();
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== MenÃº ===");
            System.out.println("1. Agregar pedido");
            System.out.println("2. Entregar pedido");
            System.out.println("3. Mostrar pedidos pendientes");
            System.out.println("4. Buscar pedido por peso");
            System.out.println("5. Mostrar pedidos en orden ascendente");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opciÃ³n: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1: 
                    System.out.print("Ingresa la ciudad destino: ");
                    String ciudadDestino = scanner.nextLine();
                    System.out.print("Ingresa el peso (en toneladas): ");
                    double peso = scanner.nextDouble();
                    System.out.print("Ingresa el volumen (en metros cÃºbicos): ");
                    double volumen = scanner.nextDouble();
                    sistema.agregarPedido(ciudadDestino, peso, volumen);
                    
                    break;
                case 2: 
                    sistema.entregarPedido();
                    break;
                case 3: 
                    sistema.mostrarPedidos();
                    break;
                case 4: 
                    System.out.print("Ingresa el peso del pedido a buscar: ");
                    double pesoBuscar = scanner.nextDouble();
                    sistema.buscarPedido(pesoBuscar);
                    break;
                case 5: 
                    sistema.mostrarPedidosOrdenados();
                    break;
              
                case 6: 
                    salir = true;
                    break;
                default:
                    System.out.println("OpciÃ³n no vÃ¡lida. Intenta de nuevo.");
            }
        }

        scanner.close();
        System.out.println("Sistema finalizado.");
    }
    
}
