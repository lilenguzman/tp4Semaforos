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
public class Atleta implements Runnable {

    private Testigo testigo;
    
    public Atleta(Testigo tes){
       
        this.testigo=tes;
    }
    public void run(){

       testigo.correr();
        
    }
  
    
}
