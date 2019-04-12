/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainfile;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author 71725655
 */
public class MainFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final int N=10;
        
        int a[]= new int[N];
        
        
        for (int i = 0; i < N; i++) {
            a[i]=(int) (Math.random()*(N*10));
        }
        
        
        
        
        GestoreCalcoli gc = new GestoreCalcoli();
        gc.setRisultato(0);
        System.out.println(gc.getRisultato());
        
        for (int i = 0; i < N; i++) {
            new Thread(new Calcolo(a[i],gc)).start();
        }
        
        while(Thread.activeCount()>1){
            System.out.println(Thread.activeCount());
        }
        
        System.out.println("ho concluso ");
        System.out.println(Thread.activeCount()+ "\n");
        System.out.println("Risultato finale: " + gc.getRisultato());
    }
    
}
