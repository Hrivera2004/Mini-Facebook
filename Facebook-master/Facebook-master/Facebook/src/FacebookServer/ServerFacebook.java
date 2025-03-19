/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FacebookServer;

/**
 *
 * @author hriverav
 */
import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ServerFacebook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ServerSocket socketServer = null;
        Socket socketCliente = null;
        UsersOnlinesList users=new UsersOnlinesList();        
        try {
            socketServer = new ServerSocket(4444);
            System.out.println("Server Arriba\nEsperando un Cliente");
            while(true){
                socketCliente = socketServer.accept();                
                System.out.println("Se conecto un Cliente......");               
                users.getU().add(new UserOnline(socketCliente,users));
                users.getU().get(users.getU().size()-1).start();
            }            
        } catch (IOException e) {         
        }        
        socketServer.close();
        
    }
    
}
