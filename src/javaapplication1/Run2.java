/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Sala 6
 */
public class Run2 {

    public static void main(String[] args) {
        //        Exthread th1 = new Exthread("Hilo Uno");
        //        Exthread th2 = new Exthread("Hilo Dos");
        //        th1.start();
        //        th2.start();
        ExRunnable run1 = new ExRunnable("Runner 1");
        ExRunnable run2 = new ExRunnable("Runner 2");
        Thread thrun1=new Thread(run1);
        Thread thrun2=new Thread(run2);
        thrun1.start();
        thrun2.start();
    }

}
