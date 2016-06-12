
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
public class Grafo {
    Vertice verticePrincipal;
    Lista todosVertices;

    public Grafo() {
        todosVertices = new Lista();
    }

    public Grafo(Vertice verticePrincipal) {
        this.verticePrincipal = verticePrincipal;
        todosVertices = new Lista();
    }

    public Vertice getVerticePrincipal() {
        return verticePrincipal;
    }

    public void setVerticePrincipal(Vertice verticePrincipal) {
        this.verticePrincipal = verticePrincipal;
    }

    public Lista getTodosVertices() {
        Lista retorno = new Lista();
        retorno.push(this.verticePrincipal);
        for (int i = 0; i < this.todosVertices.getSize(); i++) {
            retorno.push((this.todosVertices.get(i)));
        }
        return retorno;
    }

    public void setTodosVertices(Lista todosVertices) {
        this.todosVertices = todosVertices;
    }

    public void addVertice(Object instalacion) {
        this.todosVertices.push(new Vertice(instalacion));
    }

    public boolean verificarExistencia(Vertice uno) {
        if(uno == this.verticePrincipal){
        return true;
        }
        for (int i = 0; i < this.todosVertices.getSize(); i++) {
            if (uno == this.todosVertices.get(i)) {
                return true;
            }
        }
        return false;
    }

    public void addEdge(Vertice origin, Arista conexion) {
        origin.getAristas().push(conexion);
    }

    public boolean isAdyacente(Vertice uno, Vertice dos) {
        if (verificarExistencia(uno) && verificarExistencia(dos)) {
            for (int i = 0; i < uno.getAristas().getSize(); i++) {
                if (((Arista) uno.getAristas().get(i)).getDestino() == dos) {
                    return true;
                }
            }
            for (int i = 0; i < dos.getAristas().getSize(); i++) {
                if (((Arista) dos.getAristas().get(i)).getDestino() == uno) {
                    return true;
                }
            }
        }
        return false;
    }

    public Lista getAdyacentes(Vertice nodo) {
        Lista retorno = new Lista();

        if (verificarExistencia(nodo)) {
            for (int i = 0; i < nodo.getAristas().getSize(); i++) {
                retorno.push(((Arista) nodo.getAristas().get(i)).getDestino());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Uno de estos vertices no existe en el grafo",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return retorno;
    }

    public void removeEdge(Vertice uno, Vertice dos) {
        if (verificarExistencia(uno) && verificarExistencia(dos)) {
            for (int i = 0; i < uno.getAristas().getSize(); i++) {
                if (((Arista) uno.getAristas().get(i)).getDestino() == dos) {
                    uno.getAristas().remove(i);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Uno de estos vertices no existe en el grafo",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void removeVertex(Vertice borrar) {
        if (verificarExistencia(borrar)) {
            for (int i = 0; i < this.todosVertices.getSize(); i++) {
                for (int k = 0; k < ((Vertice) this.todosVertices.get(i)).getAristas().getSize(); i++) {
                     if(((Arista)((Vertice) this.todosVertices.get(i)).getAristas().get(k)).getDestino() == borrar){
                         ((Vertice) this.todosVertices.get(i)).getAristas().remove(k);
                     }
                }
                if (this.todosVertices.get(i) == borrar) {
                    this.todosVertices.remove(i);
                }
            }
        }
    }
}
