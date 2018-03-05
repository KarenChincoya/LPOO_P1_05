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
public class SubSubAlpha extends Alpha{
    private SubSubAlpha() { s += "subsub "; } 
    public static void main(String[] args){
        new SubSubAlpha();
         System.out.println(s); 
    }
}
