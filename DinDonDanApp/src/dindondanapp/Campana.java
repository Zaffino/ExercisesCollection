/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindondanapp;

/**
 * 
 * @author Zaffino
 */
public class Campana implements Runnable{

    String suono;
    int volte;
    
    /**
    * @param suono suono sottoforma di stringa
    * @param volte numero di ripetizioni
    */
    
    public Campana(String suono, int volte){
        this.suono=suono;
        this.volte=volte;
    }
    
    @Override
    public void run() {
        for(int k=0;k< volte;k++){
            System.out.println((k+1)+" "+suono );
        }
    }
    
}
