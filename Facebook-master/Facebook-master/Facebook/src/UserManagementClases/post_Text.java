/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserManagementClases;

import java.io.Serializable;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author hriverav
 */
public class post_Text extends post implements Serializable{
    private String Caption;
    private static final long SerialVersionUID=777;    
    
    public post_Text(String Caption, String owner, String titulo) {
        super(owner, titulo);
        this.Caption = Caption;
    }
    

    public String getCaption() {
        return Caption;
    }

    public void setCaption(String Caption) {
        this.Caption = Caption;
    }


    @Override
    public String toString() {
        return "post_Text{" + "Caption=" + Caption + '}';
    }

    
    
    
    
}
