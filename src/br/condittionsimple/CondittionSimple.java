/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.condittionsimple;

import java.util.Scanner;

/**
 *
 * @author Marce
 */
public class CondittionSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float n1, n2, medi;
        Scanner entrada = new Scanner(System.in);
         
        System.out.print("Digite o primeiro valor: ");
        n1 = entrada.nextFloat();
        
        System.out.print("Digite o segundo valor: ");
        n2 = entrada.nextFloat();
        
        medi = (n1 + n2) / 2;
        String tes = medi >= 9 ? "Parabens" : "";
        System.out.println("A media e: " + medi + " " + tes);
        
        
    }
    
    
}
