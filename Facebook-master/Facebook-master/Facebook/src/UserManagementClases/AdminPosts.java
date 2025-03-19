/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserManagementClases;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author hriverav
 */
public class AdminPosts {
    private ArrayList<post> posts = new ArrayList();
    public File FilePosts = null; //se inicia nulo porque se le da el file despues

    public AdminPosts() {
    }

    public AdminPosts(String path) {
        this.FilePosts = new File(path);//busca o crear el file usando el String path
    }

    public ArrayList<post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<post> posts) {
        this.posts = posts;
    }

    public File getFilePosts() {
        return FilePosts;
    }

    public void setFilePosts(File FilePosts) {
        this.FilePosts = FilePosts;
    }

    
    
    @Override
    public String toString() {
        return "AdministrarUsuario{"+ ", Users=" + FilePosts + '}';
    }
    
    public void addtoFile() throws IOException{//de la arraylist manda al File informacion
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        
        try{
            fw = new FileOutputStream(FilePosts); 
            bw = new ObjectOutputStream(fw); 
            
            for (post u : posts) {
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
            posts = new ArrayList();
            
            if (FilePosts.exists()) {
                FileInputStream entrada = new FileInputStream(FilePosts);
                ObjectInputStream objeto  = new ObjectInputStream(entrada);
                try {
                    post temp=null;
                    do{
                        temp = (post)objeto.readObject();
                        posts.add(temp);
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
    
}
