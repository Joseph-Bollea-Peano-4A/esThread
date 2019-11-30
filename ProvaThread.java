/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provathread;

/**
 *
 * @author joseph.bollea
 */
public class ProvaThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClasseHi hi = new ClasseHi();
        ClasseHello hello = new ClasseHello();
        hi.start();
        hello.start();
    }

}
