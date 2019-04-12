/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainfile;

/**
 *
 * @author 71725655
 */
public class Calcolo implements Runnable{

    private int d;
    private GestoreCalcoli gc;
    
    public Calcolo(int d, GestoreCalcoli gc){
        this.d=d;
        this.gc=gc;
                
    }


    
    @Override
    public void run() {
        gc.setRisultato(gc.getRisultato()+(d*d));
        System.out.println(Thread.currentThread().getName()+" "+gc.getRisultato());
    }
    
}
