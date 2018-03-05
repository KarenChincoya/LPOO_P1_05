/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1.SelfTest;

/**
 *
 * @author Karen Velasco
 */
public class E5 {
    public static void main(String[] args){
        System.out.println("Compiler error at line 8, because a has the default access level, "
                + "this means that it can only be accesed by the classes inside of pkgA.\n" +
                "Compiler error at line 9, because b has the protected access modifier, "
                + "this means that it can only be accesed by the classes inside the pkgA "
                + "and the classes that extends Foo.");
    }
}
