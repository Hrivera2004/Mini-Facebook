/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserManagementClases;

import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

public class reminderHilo extends Thread{
    private int retraso = 0;
    private String mensaje = "";

    public reminderHilo(int retraso, String mensaje) {
        this.retraso = retraso;
        this.mensaje = mensaje;
    }

    public int getRetraso() {
        return retraso;
    }

    public void setRetraso(int retraso) {
        this.retraso = retraso;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    

    public void run() {
        try {
            // Dormir el hilo por el tiempo de retraso
            TimeUnit.MINUTES.sleep(retraso);
            JOptionPane.showMessageDialog(null, mensaje);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}