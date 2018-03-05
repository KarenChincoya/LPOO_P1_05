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
public class DogShow {
     public static void main(String[] args) {
         new DogShow().go();
     } 
     void go() { 
         new Hound().bark();
         ((Dog) new Hound()).bark();
         ((Dog) new Hound()).sniff(); 
     }
}
