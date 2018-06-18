/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sala 6
 */
public class ExRunnable implements Runnable{
    private String name;

    public ExRunnable(String name) {
        this.name=name;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name+"==>"+i);
            try {
                Thread.sleep(new Random().nextInt(901)+100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Exthread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
