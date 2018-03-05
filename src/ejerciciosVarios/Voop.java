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
public class Voop {
    public static void main(String[] args){
        doStuff(1);
        doStuff(1,2);
    }
//    static void doStuff(int ... doArgs){} //It'll compile
//    static void doStuff(int[] doArgs){} //It won't compile becase doStuff(1,2)
//    static void doStuff(int doArgs ... ){} //won't compile because the order of the "..." 
//    static void doStuff(int ... doArgs, int y){}//won't complie because the int ... doArgs goes at the end
    static void doStuff(int x, int ... doArgs){} //This will compile
    
}
