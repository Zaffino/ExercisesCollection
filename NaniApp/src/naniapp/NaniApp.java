/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naniapp;

/**
 *
 * @author Zaffino
 */
public class NaniApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread thr1=new ContaNani("topo");
        thr1.start();
        Thread thr2=new ContaNani("pippo");
        thr2.start();
    }
    
}
