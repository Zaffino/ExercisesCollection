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
public class ContaNani extends Thread{
    /**
     * crea i nani.
     * @param name nome del nuovo thread (nano).
     */
    public ContaNani(String name) {
        super(name);
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 7; i++) {                                           //conta fino a 7 per ogni nano
            System.out.println((i+1) + " " + getName());                        
        }
    }
    
}
