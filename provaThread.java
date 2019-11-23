/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaThread;

import javax.swing.JOptionPane;

/**
 *
 * @author claudio.caputo
 */
public class provaThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Hi ciao1 = new Hi();
        Hello ciao2 = new Hello();
        Say parola1 = new Say("CIAO");
        Say parola2 = new Say("ciao");
        parola1.start();
        parola2.start();
        
        ciao1.start();
        ciao2.start();

    }

}
