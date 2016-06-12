
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manuel
 */
public class Instalacion {
    String nombre;
    int tipoPunto;
    /*Si tipo punto == 1  entonces es red domestica
     Si tipo punto == 2  entonces es red empresarial
     Si tipo punto == 3  entonces es antena celular
     Si tipo punto == 4  entonces es conexion dedicada
     */

    public Instalacion() {
    }

    public Instalacion(String nombre, int tipoPunto) {
        this.nombre = nombre;
       
        if (tipoPunto == 1 || tipoPunto == 2 || tipoPunto == 3 || tipoPunto == 4) {
            this.tipoPunto = tipoPunto;
        } else {
            JOptionPane.showMessageDialog(null, "SE le asignara un tipo de punto predetermindado", "ERROR", JOptionPane.ERROR_MESSAGE);
            this.tipoPunto = 4;
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipoPunto() {
        return tipoPunto;
    }

    public void setTipoPunto(int tipoPunto) {
        if (tipoPunto == 1 || tipoPunto == 2 || tipoPunto == 3 || tipoPunto == 4) {
            this.tipoPunto = tipoPunto;
        } else {
            JOptionPane.showMessageDialog(null, "SE le asignara un tipo de punto predetermindado", "ERROR", JOptionPane.ERROR_MESSAGE);
            this.tipoPunto = 4;
        }
    }

    @Override
    public String toString() {
        return nombre + " ";
    }

}
