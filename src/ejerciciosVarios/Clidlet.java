/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosVarios;

/**
 *
 * @author Karen Velasco
 */
public class Clidlet extends Clidder{
     public final void flipper() { 
         System.out.println("Clidlet");  
     }  
     
     public static void main(String [] args) {
         new Clidlet().flipper();
     } 
}
