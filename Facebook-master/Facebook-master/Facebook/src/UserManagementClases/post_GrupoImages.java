/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserManagementClases;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author hriverav
 */
public class post_GrupoImages extends post implements Serializable {

    ArrayList<File> images;
    private static final long SerialVersionUID = 777;

    public post_GrupoImages(ArrayList<File> images, String owner, String caption, String titulo) {
        super(owner, caption, titulo);
        this.images = images;
    }

    public ArrayList<File> getImages() {
        return images;
    }

    public void setImages(ArrayList<File> images) {
        this.images = images;
    }

    public void addImages(File image) {
        images.add(image);
    }

    public ArrayList<ImageIcon> getImageIcon() {
        try {
            ArrayList<ImageIcon> icons = new ArrayList<>();
            for (File image : images) {
                BufferedImage bufferedImage = ImageIO.read(new File(image.getAbsolutePath()));
                Image resized = bufferedImage.getScaledInstance(240, 180, Image.SCALE_DEFAULT);
                icons.add(new ImageIcon(resized));
            }
            return icons;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
