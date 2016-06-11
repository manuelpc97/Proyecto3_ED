
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
    int materialConexion;
    int longitudCable;
    int anchoBanda;
    /*Si tipo punto == 1  entonces es red domestica
     Si tipo punto == 2  entonces es red empresarial
     Si tipo punto == 3  entonces es antena celular
     Si tipo punto == 4  entonces es conexion dedicada
     */

    public Instalacion() {
    }

    public Instalacion(String nombre, int tipoPunto, int materialConexion, int longitudCable, int anchoBanda) {
        this.nombre = nombre;
        this.longitudCable = longitudCable;
        this.anchoBanda = anchoBanda;

        if (materialConexion == 1 || materialConexion == 2) {
            this.materialConexion = materialConexion;
        } else {
            JOptionPane.showMessageDialog(null, "Error de material, se le asignara el material mas barato", "ERROR", JOptionPane.ERROR_MESSAGE);
            this.materialConexion = 1;
        }

        if (tipoPunto == 1 || tipoPunto == 2 || tipoPunto == 3 || tipoPunto == 4) {
            this.tipoPunto = tipoPunto;
        } else {
            JOptionPane.showMessageDialog(null, "SE le asignara un tipo de punto predetermindado", "ERROR", JOptionPane.ERROR_MESSAGE);
            this.tipoPunto = 4;
        }
    }

    public boolean datosCorrectos(int ancho) {
        if (this.hasCobre() && ancho <= 100) {
            return true;
        } else if (this.hasFibra() && (ancho > 100 && ancho <= 1024)) {
            return true;
        }
        return false;
    }

    public boolean hasCobre() {
        if (this.materialConexion == 1) {
            return true;
        }
        return false;
    }

    public boolean hasFibra() {
        if (this.materialConexion == 2) {
            return true;
        }
        return false;
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

    public int getMaterialConexion() {
        return materialConexion;
    }

    public void setMaterialConexion(int material) {
        if (material == 1 || material == 2) {
            this.materialConexion = material;
        } else {
            JOptionPane.showMessageDialog(null, "Error de material, se le asignara el material mas barato", "ERROR", material);
            this.materialConexion = 1;
        }
    }

    public int getLongitudCable() {
        return longitudCable;
    }

    public void setLongitudCable(int longitudCable) {
        this.longitudCable = longitudCable;
    }

    public int getAnchoBanda() {
        return anchoBanda;
    }

    public void setAnchoBanda(int anchoBanda) {
        if (datosCorrectos(anchoBanda)) {
            this.anchoBanda = anchoBanda;
        } else {
            JOptionPane.showMessageDialog(null, "Error de material, no soporta el ancho de banda", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
