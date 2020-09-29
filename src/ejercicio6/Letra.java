/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author LILEN
 */
public class Letra implements Runnable {

    private char nombre;
    private int id;
    private Turno turno;

    public Letra(char letra, int id, Turno turno) {
        this.nombre = letra;
        this.id = id;
        this.turno = turno;
    }

    public void run() {

        int i;
        for (i = 0; i < 5; i++) // Cantidad de veces que se repite la secuencia.
        {
            imprimir();
        }
    }

    private void imprimir() {

//   if (nombre == 'A') {
//            turno.imprimirA();
//        } else {
//            if (nombre == 'B') {
//               turno.imprimirB();
//            } else {
//                if (nombre == 'C') {
//                   turno.imprimirC();
//                }
//            }
//        }
        switch(this.nombre){
            case 'A':turno.imprimirA(nombre,id);break;
            case 'B':turno.imprimirB(nombre,id);break;
            case 'C':turno.imprimirC(nombre,id);break;
            default:System.out.println("Error");
        }
    }

}
