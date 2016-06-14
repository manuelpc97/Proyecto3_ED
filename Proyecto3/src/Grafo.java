
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
        if (uno == this.verticePrincipal) {
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
                    if (((Arista) ((Vertice) this.todosVertices.get(i)).getAristas().get(k)).getDestino() == borrar) {
                        ((Vertice) this.todosVertices.get(i)).getAristas().remove(k);
                    }
                }
                if (this.todosVertices.get(i) == borrar) {
                    this.todosVertices.remove(i);
                }
            }
        }
    }

    public Lista getPaths(Vertice inicio, Vertice fin) {
        Lista nodos = new Lista();
        Lista retorno = new Lista();
        retorno = this.getTodosVertices();
        nodos.push(inicio);
        retorno.remove(retorno.find(inicio));
        nodos.concat(retorno);
        retorno = new Lista();
        int[][] matriz = new int[nodos.getSize()][nodos.getSize()];
        for (int i = 0; i < nodos.getSize(); i++) {
            for (int j = 0; j < nodos.getSize(); j++) {
                matriz[i][j] = -1;
            }
        }

        retorno.push(new Lista(nodos.get(0)));

        for (int i = 0; i < nodos.getSize(); i++) {
            for (int m = 0; m < ((Vertice) nodos.get(i)).getAristas().getSize(); m++) {
                for (int k = 0; k < nodos.getSize(); k++) {
                    if (((Arista) ((Vertice) nodos.get(i)).getAristas().get(m)).getDestino() == nodos.get(k)) {
                        matriz[i][k] = ((Arista) ((Vertice) nodos.get(i)).getAristas().get(m)).getLongitudCable();
                        for (int p = 0; p < retorno.getSize(); p++) {
                            if (nodos.get(i) == ((Lista) retorno.get(p)).get(((Lista) retorno.get(p)).getSize() - 1)) {
                                Lista temporal = new Lista();
                                for (int q = 0; q < ((Lista) retorno.get(p)).getSize(); q++) {
                                    temporal.push(((Lista) retorno.get(p)).get(q));
                                }
                                temporal.push(nodos.get(k));
                                retorno.push(temporal);
                            }
                        }
                    }
                }
            }
        }

        System.out.println("El tamaño es : " + retorno.getSize());
        return retorno;
    }

    public Lista caminoMasCorto(Vertice uno, Vertice dos) {
        Lista retorno = new Lista();
        Lista minimoCamino = new Lista();
        Lista camino = new Lista();
        retorno = this.getPaths(uno,dos);
        int parametro = 0;

        for (int i = 0; i < retorno.getSize(); i++) {
            if (uno == ((Lista) retorno.get(i)).get(0)
                    && dos == ((Lista) retorno.get(i)).get(((Lista) retorno.get(i)).getSize() - 1)) {
                camino = ((Lista) retorno.get(i));
                int acumulador = 0;
                for (int m = 0; m < camino.getSize(); m++) {
                    if (m < camino.getSize() - 1) {
                        for (int p = 0; p < ((Vertice) camino.get(m)).getAristas().getSize(); p++) {
                            if(((Arista)((Vertice) camino.get(m)).getAristas().get(p)).getDestino() == camino.get(m+1)){
                                acumulador+=((Arista)((Vertice) camino.get(m)).getAristas().get(p)).getLongitudCable();
                            }
                        }
                    }
                }
                if(parametro == 0){
                    parametro = acumulador;
                    acumulador = 0;
                    minimoCamino = camino;
                }else if(acumulador < parametro){
                    parametro = acumulador;
                    acumulador = 0;
                    minimoCamino = camino;
                }
            }
        }
        return minimoCamino;
    }
}
