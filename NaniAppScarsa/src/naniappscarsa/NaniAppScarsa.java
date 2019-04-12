/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naniappscarsa;

/**
 *
 * @author 71725655
 */
public class NaniAppScarsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread thr1=new ContaNani("topo");
        thr1.start();
        
        System.out.println(Thread.currentThread().getName());
    }
    
    
}
