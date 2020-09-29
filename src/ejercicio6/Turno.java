/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author LILEN
 */
public class Turno {
    private Semaphore semA= new Semaphore(1);
    private Semaphore semB= new Semaphore(0);
    private Semaphore semC= new Semaphore(0);
    
    public void imprimirA(char letra, int repe){
        try {
            semA.acquire();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Turno.class.getName()).log(Level.SEVERE, null, ex);
        }
        imprimir(letra, repe);
        semB.release();
    }
    public void imprimirB(char letra, int repe){
        try {
            semB.acquire();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Turno.class.getName()).log(Level.SEVERE, null, ex);
        }
        imprimir(letra, repe);
        semC.release();
    }
    public void imprimirC(char letra, int repe){
        try {
            semC.acquire();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Turno.class.getName()).log(Level.SEVERE, null, ex);
        }
        imprimir(letra, repe);
        semA.release();
    }
    
    private void imprimir(char letra, int repe){
        int i;
        for(i=0;i<repe;i++)
            System.out.print(letra+" ");
    }
}
