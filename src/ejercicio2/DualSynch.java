/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author LILEN
 */
public class DualSynch {
private Object syncObjectEste = new Object();
int dato=5;
public synchronized void f () {
for ( int i = 0 ; i < 5 ; i++) {
    dato=dato*4;
    System.out.println( "f()" +dato);
Thread.yield();
}
}
public void g () {
synchronized (syncObjectEste) {
for ( int i = 0 ; i < 5 ; i++) {
    dato=dato+20;
    System.out.println( "g()"+dato );
Thread.yield();
}
}
}
}