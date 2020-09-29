/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author LILEN
 */
import java.util.concurrent.Semaphore;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.*;
public class Testigo {

    private Semaphore semTestigo = new Semaphore(1);

    public void correr() {
        try {
            this.semTestigo.acquire();//adquiero el semaforo

        } catch (InterruptedException ex) {
            Logger.getLogger(Testigo.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        procesoCorrer();
        this.semTestigo.release();//libero el semaforo
    }

    public void procesoCorrer() {
        long ini, fin;
        System.out.println("\033[34mComienza a correr: " + Thread.currentThread().getName());
        ini=System.currentTimeMillis();
        Random tiempo = new Random();
        int tiempoCorriendo = tiempo.nextInt(11 - 9 + 1) + 9;
        
        try {
            Thread.sleep(tiempoCorriendo*1000);//simulo tiempo de carrera
            System.out.println("Pasa el testigo");
            fin=System.currentTimeMillis();
            System.out.println("Tiempo Corriendo: "+(fin-ini)/1000+" segundos");
        } catch (InterruptedException ex) {
            Logger.getLogger(Testigo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
