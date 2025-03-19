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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.Imaging;

/**
 *
 * @author hriverav
 */
public class post_image extends post implements Serializable {

    private String image;
    private static final long SerialVersionUID = 777;

    public post_image(String image, String owner, String caption, String titulo) {
        super(owner, caption, titulo);
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ImageIcon getImageIcon() {
        try {
            BufferedImage bufferedImage = ImageIO.read(new File(image));
            Image image = bufferedImage.getScaledInstance(600, 380, Image.SCALE_DEFAULT);
            return new ImageIcon(image);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

  

}
