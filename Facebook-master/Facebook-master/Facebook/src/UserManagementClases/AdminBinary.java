/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserManagementClases;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class AdminBinary {
    private ArrayList<Usuario> Users = new ArrayList();
    public File FileUsers = null; //se inicia nulo porque se le da el file despues

    public AdminBinary() {
    }

    public AdminBinary(String path) {
        this.FileUsers = new File(path);//busca o crear el file usando el String path
    }

    public File getUsers() {
        return FileUsers;
    }

    public void setUsers(File Users) {
        this.FileUsers = Users;
    }

    public ArrayList<Usuario> getUser() {
        return Users;
    }

    public void setUser(ArrayList<Usuario> User) {
        this.Users = User;
    }
    
    @Override
    public String toString() {
        return "AdministrarUsuario{"+ ", Users=" + FileUsers + '}';
    }
    
    public void addtoFile() throws IOException{//de la arraylist manda al File informacion
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        
        try{
            fw = new FileOutputStream(FileUsers); 
            bw = new ObjectOutputStream(fw); 
            
            for (Usuario u : Users) {
                bw.writeObject(u);
            }
           
            
            bw.flush();
            
        }catch(IOException io){
            io.printStackTrace();
        }
        
        bw.close();
        fw.close();
    }
    
    public void LoadFile() throws IOException, ClassNotFoundException{//lee el File
        try { 
            Users = new ArrayList();
            
            if (FileUsers.exists()) {
                FileInputStream entrada = new FileInputStream(FileUsers);
                ObjectInputStream objeto  = new ObjectInputStream(entrada);
                try {
                    Usuario temp=null;
                    do{
                        temp = (Usuario)objeto.readObject();
                        Users.add(temp);
                    }while(temp!=null);
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (EOFException ex) {
            ex.printStackTrace();
        }
    }
    
    //
    public boolean exists_Login(String gmail,String password) throws IOException, ClassNotFoundException {
        try {
            LoadFile();
            for (int i = 0; i < Users.size(); i++) {
                if (Users.get(i).getCorreo().equals(gmail)) {
                    if (Users.get(i).getContrasena().equals(password)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
        }
        
        return false;
    }
    public boolean exists_registro(String gmail) throws IOException, ClassNotFoundException{
        try {
            LoadFile();
            for (int i = 0; i < Users.size(); i++) {
                if (Users.get(i).getCorreo().equals(gmail)) {
                    return false;
                }
            }
        } catch (Exception e) {
        }
        
        return true;
    }
    public int findUser(String gmail){
        try {
            for (int i = 0; i < Users.size(); i++) {
                if (Users.get(i).getCorreo().equals(gmail)) {
                    return i;
                }
            }
        } catch (Exception e) {
        }
        return -1;
    }
}
