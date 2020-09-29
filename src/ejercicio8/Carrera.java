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
public class Carrera {
    public static void main(String[] args) {
        int i;
        Testigo testigo=new Testigo();
        
        Thread[] hilo=new Thread[4];
        
        int numAtleta=1;
        for(i=0;i<4;i++){
            hilo[i]=new Thread(new Atleta(testigo),"Atleta "+numAtleta);//no se si hay que poner numero a los atletas
            numAtleta++;
        }
        
        for(i=0;i<4;i++){
            hilo[i].start();
        }
        
    }
}
