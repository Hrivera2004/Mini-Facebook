/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserManagementClases;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


public class RegularUsu extends Usuario implements Serializable{
        protected String nickname = "None";
        protected String pais;
        protected String nombreCom;
        protected Date fechaNacer; 
        protected String sexo;
        protected boolean banned = false;
        
        
    private static final long SerialVersionUID=777;

    public RegularUsu() {
    }

    public RegularUsu(String correo, String contrasena, String pais, String nombreCom, String sexo, Date fechaNacer) {
        super(correo, contrasena);
        this.pais = pais;
        this.nombreCom = nombreCom;
        this.fechaNacer = fechaNacer;
        this.sexo = sexo;
    }
    

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombreCom() {
        return nombreCom;
    }

    public void setNombreCom(String nombreCom) {
        this.nombreCom = nombreCom;
    }

    public Date getFechaNacer() {
        return fechaNacer;
    }

    public void setFechaNacer(Date fechaNacer) {
        this.fechaNacer = fechaNacer;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isBanned() {
        return banned;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
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

    @Override
    public String toString() {
        return super.toString()+"RegularUsu{" + "nickname=" + nickname + ", pais=" + pais + ", nombreCom=" + nombreCom + ", fechaNacer=" + fechaNacer + ", sexo=" + sexo + ", banned=" + banned + '}';
    }

    
    

    


        

    
}
