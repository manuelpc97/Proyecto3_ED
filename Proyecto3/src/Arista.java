
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
public class Arista {
    Vertice destino;
    Vertice origen;
    int longitudCable;
    int anchoBanda;
    int materialConexion;

    public Arista() {
    }

    
    public Arista(Vertice origin, Vertice destiny) {
        this.destino = destiny;
        this.origen = origin;
        this.materialConexion = 1;
        this.longitudCable = 1;
        this.anchoBanda = 1;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public Vertice getOrigen() {
        return origen;
    }

    public void setOrigen(Vertice origen) {
        this.origen = origen;
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
            this.anchoBanda = anchoBanda;
        
    }

    public void setMaterialConexion(int material) {
            this.materialConexion = material;
    }

    @Override
    public String toString() {
        return origen.getValue() + " <--> " + destino.getValue();
    }
    
    
}
