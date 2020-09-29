/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author LILEN
 */
public class DualSynch {
private Object syncObjectEste = new Object();
public synchronized void f () {
for ( int i = 0 ; i < 5 ; i++) {
    System.out.println( "f()" );
Thread.yield();
}
}
public void g () {
synchronized (syncObjectEste) {
for ( int i = 0 ; i < 5 ; i++) {
    System.out.println( "g()" );
Thread.yield();
}
}
}
}