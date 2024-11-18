/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazapp;

/**
 *
 * @author jerso
 */
public class Pedido {
    

    
    String ciudadDestino;
    double peso; 
    double volumen; 

    public Pedido(String ciudadDestino, double peso, double volumen) {
        this.ciudadDestino = ciudadDestino;
        this.peso = peso;
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Pedido [Ciudad destino=" + ciudadDestino + ", Peso=" + peso + ", Volumen=" + volumen + "]";
    }
   
    
}

