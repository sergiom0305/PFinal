/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazapp;

/**
 *
 * @author jerso
 */
public class ArbolBinario {
    

    Nodo raiz;

    public void insertar(Pedido pedido) {
        raiz = insertarRec(raiz, pedido);
    }

    private Nodo insertarRec(Nodo raiz, Pedido pedido) {
        if (raiz == null) {
            return new Nodo(pedido);
        }
        if (pedido.peso < raiz.pedido.peso) {
            raiz.izquierda = insertarRec(raiz.izquierda, pedido);
        } else if (pedido.peso > raiz.pedido.peso) {
            raiz.derecha = insertarRec(raiz.derecha, pedido);
        }
        return raiz;
    }

    public Pedido buscar(double peso) {
        return buscarRec(raiz, peso);
    }

    private Pedido buscarRec(Nodo raiz, double peso) {
        if (raiz == null) {
            return null; 
        }
        if (peso == raiz.pedido.peso) {
            return raiz.pedido;
        }
        if (peso < raiz.pedido.peso) {
            return buscarRec(raiz.izquierda, peso);
        }
        return buscarRec(raiz.derecha, peso);
    }

    public void inOrden() {
        inOrdenRec(raiz);
    }

    private void inOrdenRec(Nodo raiz) {
        if (raiz != null) {
            inOrdenRec(raiz.izquierda);
            System.out.println(raiz.pedido);
            inOrdenRec(raiz.derecha);
        }
    }
    
    class Nodo {
    Pedido pedido;
    Nodo izquierda, derecha;

    public Nodo(Pedido pedido) {
        this.pedido = pedido;
        izquierda = derecha = null;
    }
  }  
}

