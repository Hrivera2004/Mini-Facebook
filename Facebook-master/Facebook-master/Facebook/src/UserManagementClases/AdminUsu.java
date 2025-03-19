/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserManagementClases;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author DELL
 */
public class AdminUsu extends Usuario implements Serializable{
    protected String nombre;

    
    private static final long SerialVersionUID=777;

    public AdminUsu(String correo, String contrasena,String nombre) {
        super(correo, contrasena);
        this.nombre = nombre;
    }

    

    public AdminUsu() {
    }


    public String getAdminLevel() {
        return nombre;
    }

    public void setAdminLevel(String adminLevel) {
        this.nombre = adminLevel;
    }

    @Override
    public String toString() {
        return super.toString()+"AdminUsu{" + "nombre=" + nombre + '}';
    }

    
     
}
