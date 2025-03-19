/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserManagementClases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hriverav
 */
public class Chat implements Serializable{
    private String name;
    private ArrayList<Message> messages = new ArrayList();
    private int notificacion = 0;
    
    private static final long SerialVersionUID=777;

    public Chat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public int getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(int notificacion) {
        this.notificacion = notificacion;
    }

    @Override
    public String toString() {
        return "Chat{" + "name=" + name + ", messages=" + messages + ", notificacion=" + notificacion + '}';
    }
    
    
}
