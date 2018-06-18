/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sala 6
 */
public class run {

    public static void main(String[] args) {
        Ventana vn = new Ventana();
        vn.setVisible(true);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Calendar hour = Calendar.getInstance();
                    int horas = hour.get(Calendar.HOUR);
                    int min = hour.get(Calendar.MINUTE);
                    int seconds = hour.get(Calendar.SECOND);
                    String a = horas + ":" + min + ":" + seconds;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    vn.cambiarHora(a);
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE; i++) {
                    System.out.println(i);
                    vn.cambiarTexto(i);
                }
            }
        }).start();
    }
}
