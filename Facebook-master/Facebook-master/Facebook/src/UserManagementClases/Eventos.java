/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserManagementClases;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class Eventos implements Serializable{
    private Date fecha;
    private String nombre = "";
    private String des = "";
    private boolean recordatorio;
    
    private static final long SerialVersionUID=777;

    public Eventos() {
    }

    
    public Eventos(Date fecha, String nombre, String des, boolean recordatorio) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.des = des;
        this.recordatorio = recordatorio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public boolean isRecordatorio() {
        return recordatorio;
    }

    public void setRecordatorio(boolean recordatorio) {
        this.recordatorio = recordatorio;
    }
    

    @Override
    public String toString() {
        return nombre + " - " + des;
    }
    
    
    
}
