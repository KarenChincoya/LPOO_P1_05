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
public class House extends Building{
    House() {  System.out.print("h ");  } 
    House(String name) { 
        this();   
        System.out.print("hn " + name); 
    } 
   public static void main(String[] args) { new House("x "); }
}
