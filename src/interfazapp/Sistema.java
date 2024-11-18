/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazapp;

/**
 *
 * @author jerso
 */

import java.util.Comparator;
import java.util.PriorityQueue;

public class Sistema {
    

    PriorityQueue<Pedido> colaPedidos;
    ArbolBinario arbolPedidos;

    public Sistema() {
        colaPedidos = new PriorityQueue<>(new PedidoComparator());
        arbolPedidos = new ArbolBinario();
    }

    
    public void agregarPedido(String ciudadDestino, double peso, double volumen) {
        Pedido pedido = new Pedido(ciudadDestino, peso, volumen);
        colaPedidos.add(pedido);
        arbolPedidos.insertar(pedido);
        System.out.println("Pedido agregado: " + pedido);
    }

    public void entregarPedido() {
        if (!colaPedidos.isEmpty()) {
            Pedido pedido = colaPedidos.poll();
            System.out.println("Entregando pedido: " + pedido);
        } else {
            System.out.println("No hay pedidos pendientes.");
        }
    }

    public void mostrarPedidos() {
        if (colaPedidos.isEmpty()) {
            System.out.println("No hay pedidos pendientes.");
        } else {
            System.out.println("Pedidos pendientes:");
            for (Pedido pedido : colaPedidos) {
                System.out.println(pedido);
            }
        }
    }

    public void buscarPedido(double peso) {
        Pedido pedido = arbolPedidos.buscar(peso);
        if (pedido != null) {
            System.out.println("Pedido encontrado: " + pedido);
        } else {
            System.out.println("Pedido no encontrado.");
        }
    }

    public void mostrarPedidosOrdenados() {
        System.out.println("Pedidos en orden ascendente (por peso):");
        arbolPedidos.inOrden();
    }

    
    class PedidoComparator implements Comparator<Pedido> {
    @Override
    public int compare(Pedido p1, Pedido p2) {
        
        //Priorizar primero por ciudad (ciudades más cercanas tienen menor "peso" o "orden")
        int ciudadComparacion = p1.ciudadDestino.compareTo(p2.ciudadDestino);
        if (ciudadComparacion != 0) {
            return ciudadComparacion;
        }
       // Si las ciudades son iguales, priorizar por peso (mayor peso primero)  
       if (p1.peso != p2.peso) { 
        return Double.compare(p2.peso, p1.peso);
            }
    // Si el peso es igual, priorizar por volumen (menor volumen primero)
    return Double.compare(p1.volumen, p2.volumen);
    }
    }
}
    


