/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserManagementClases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;

public class Usuario implements Serializable {
    //Att
    protected String correo;
    protected String contrasena;
    protected ArrayList<Chat> chats = new ArrayList<Chat>();
    protected ArrayList<String> friends = new ArrayList<String>();
    protected ArrayList<String> friendrequest = new ArrayList<String>();
    protected ArrayList<Eventos> eventos = new ArrayList<Eventos>();
    protected Icon perfil;
    
    private static final long SerialVersionUID=777;

    //Cons 

    public Usuario() {
    }

    public Usuario(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public ArrayList<Chat> getChats() {
        return chats;
    }

    public void setChats(ArrayList<Chat> chats) {
        this.chats = chats;
    }

    public ArrayList<String> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<String> friends) {
        this.friends = friends;
    }

    public ArrayList<String> getFriendrequest() {
        return friendrequest;
    }

    public void setFriendrequest(ArrayList<String> friendrequest) {
        this.friendrequest = friendrequest;
    }

    public ArrayList<Eventos> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Eventos> eventos) {
        this.eventos = eventos;
    }

    public Icon getPerfil() {
        return perfil;
    }

    public void setPerfil(Icon perfil) {
        this.perfil = perfil;
    }
    

    @Override
    public String toString() {
        return "Usuario{" + "correo=" + correo + ", contrasena=" + contrasena + ", chats=" + chats + ", friends=" + friends + ", friendrequest=" + friendrequest + ", eventos=" + eventos + '}';
    }
    
    

    
    
}
