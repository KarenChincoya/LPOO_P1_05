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
public class Chrome {
    public static void main(String[] args){
         X x1 = new X();
         X x2 = new Y();
         Y y1 = new Y();
 //        x2.do2();        1. false
 //          (Y)x2.do2();   2. false
           ((Y)x2).do2(); //biend
    }
}
