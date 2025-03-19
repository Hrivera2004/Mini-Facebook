/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserManagementClases;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author hriverav
 */
public class post_Video extends post implements Serializable{
    private File video;
    private static final long SerialVersionUID=777;

    public post_Video(File video, String owner, String caption, String titulo) {
        super(owner, caption, titulo);
        this.video = video;
    }
    
    
    

    public File getVideo() {
        return video;
    }

    public void setVideo(File video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "post_Video{" + "video=" + video + '}';
    }
    
    
    
}
