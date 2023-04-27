/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.maquinaexpenedora;

/**
 *
 * @author alumne
 */
public class MaquinaExpenedora {

    public static void main(String[] args) {
        
    }
    private int saldo;
    private int quantitatProductes;

    public MaquinaExpenedora(int saldoInicial, int quantitatInicial) {
        saldo = saldoInicial;
        quantitatProductes = quantitatInicial;
    }
    /* Propongo que simular tres situaciones: 
    * 1. La quantitatProductes=0 -> La màquina ens ha de dir que ara mateix és buida i no pot vendre res.
    * 2. Si el preu>saldo -> La màquina ens ha de dir que el saldo és insuficient.
    * 3. En la resta de casos (saldo >= preu) -> Compra realitzada
    * Propongo utilizar sout para tener algo de feedback
    */
    
    public void realitzarCompra(int preu) {
        if (quantitatProductes == 0) {
            System.out.println("Disculpi, la màquina expenedora ara mateix és buida.");
        } else if (preu > saldo) {
            System.out.println("Saldo insuficient. Si us plau, introdueixi més efectiu.");
        } else {
            quantitatProductes--;
            saldo -= preu;
            System.out.println("Compra realitzada. Disfruti del seu producte i tingui un bon dia");
        }
    }
    
    /* 
    * Método para restablecer la cantidad de productos que tiene la máquina,
    * sugiero utilizar quantitatProductes = quantitatInicial en este método, para actualizarla. 
    */
    public void reabastir(int quantitat) {
        quantitatProductes += quantitat;
        System.out.println(quantitat + " productes s'han introduït a la màquina expenedora.");
    }
    
     
    
    
}
