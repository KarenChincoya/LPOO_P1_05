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
public class CardBoard {
     Short story = 200;  
     CardBoard go(CardBoard cb) {    
         cb = null;    
         return cb;
     }
      public static void main(String[] args) {    
         CardBoard c1 = new CardBoard();
         CardBoard c2 = new CardBoard();    
         CardBoard c3 = c1.go(c2);    
         c1 = null;    // do Stuff 
      }
}
