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
public class post implements Serializable{
    private String owner;
    private String caption;
    private String titulo;
    
    private int likes = 0;
    private int share = 0;
    private ArrayList<String> likesUsers = new ArrayList<>();
    private ArrayList<String> sharedUsers = new ArrayList<>();
    
    private ArrayList<String> comments = new ArrayList();
    private Date posted = new Date();
    private boolean removed = false;
    
    private static final long SerialVersionUID=777;

    public post(String owner, String titulo) {
        this.owner = owner;
        this.titulo = titulo;
    }

    public post(String owner, String caption, String titulo) {
        this.owner = owner;
        this.caption = caption;
        this.titulo = titulo;
    }



    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Date getPosted() {
        return posted;
    }

    public void setPosted(Date posted) {
        this.posted = posted;
    }

    public boolean isRemoved() {
        return removed;
    }

    public void setRemoved(boolean removed) {
        this.removed = removed;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<String> getComments() {
        return comments;
    }

    public void setComments(ArrayList<String> comments) {
        this.comments = comments;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }

    public ArrayList<String> getLikesUsers() {
        return likesUsers;
    }

    public void setLikesUsers(ArrayList<String> likesUsers) {
        this.likesUsers = likesUsers;
    }

    public ArrayList<String> getSharedUsers() {
        return sharedUsers;
    }

    public void setSharedUsers(ArrayList<String> sharedUsers) {
        this.sharedUsers = sharedUsers;
    }

    @Override
    public String toString() {
        return "post{" + "owner=" + owner + ", caption=" + caption + ", titulo=" + titulo + ", likes=" + likes + ", share=" + share + ", likesUsers=" + likesUsers + ", sharedUsers=" + sharedUsers + ", comments=" + comments + ", posted=" + posted + ", removed=" + removed + '}';
    }

    
    
    
    public void likebutton(String userLiking){
        boolean found = false;
        int pos  = -1;
        for (int i = 0; i < likesUsers.size(); i++) {
            if (likesUsers.get(i)==userLiking) {
                found = true;
                pos=i;
            }
        }
        if (found==false) {
            likesUsers.add(userLiking);
            likes++;
            
        }else{
            likesUsers.remove(pos);
            likes--;
        }
    }
    
    public void sharebutton(String userSharing){
        boolean found = false;
        int pos  = -1;
        for (int i = 0; i < sharedUsers.size(); i++) {
            if (likesUsers.get(i)==userSharing) {
                found = true;
                pos=i;
            }
        }
        if (found==false) {
            sharedUsers.add(userSharing);
            share++;
            
        }else{
            sharedUsers.remove(pos);
            share--;
        }
    }
    
    public void Comment(String comment, String UserCommenting){
        comments.add(UserCommenting+":"+comment+System.lineSeparator());
    }
    
    

}
