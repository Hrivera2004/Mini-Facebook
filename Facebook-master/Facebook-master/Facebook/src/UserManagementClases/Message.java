/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserManagementClases;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author hriverav
 */
public class Message implements Serializable{
    private Date sent;
    private String message,Sender,Reciver;
    
    private static final long SerialVersionUID=777;

    public Message(Date sent, String message, String Sender, String Reciver) {
        this.sent = sent;
        this.message = message;
        this.Sender = Sender;
        this.Reciver = Reciver;
    }

    

    public Date getSent() {
        return sent;
    }

    public void setSent(Date sent) {
        this.sent = sent;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return Sender;
    }

    public void setSender(String Sender) {
        this.Sender = Sender;
    }

    public String getReciver() {
        return Reciver;
    }

    public void setReciver(String Reciver) {
        this.Reciver = Reciver;
    }

    @Override
    public String toString() {
        return "Message{" + "sent=" + sent + ", message=" + message + ", Sender=" + Sender + ", Reciver=" + Reciver + '}';
    }

    
    
    
}
