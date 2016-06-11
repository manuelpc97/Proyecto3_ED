/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manuel
 */
public class Vertice {
    Object value;
    Lista aristas;

    public Vertice() {
        aristas = new Lista();
    }

    public Vertice(Object value) {
        this.value = value;
        this.aristas = new Lista();
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Lista getAristas() {
        return aristas;
    }

    public void setAristas(Lista aristas) {
        this.aristas = aristas;
    }

}
