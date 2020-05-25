/**
 * Hoja de Trabajo 10
 * Algoritmos y Estructuras de Datos
 * Sección: 20
 * Autor:
 Jose Gutierrez, 19111
 */

import java.util.ArrayList;
import java.util.List;

public class Grafo {
    private List<Nodo> Nodos;

    public void addNodo(Nodo Nodo) {
        if (Nodos == null) {
            Nodos = new ArrayList<>();
        }
        Nodos.add(Nodo);
    }

    public List<Nodo> getNodos() {
        return Nodos;
    }



    @Override
    public String toString() {
        return "Grafo [Nodos=" + Nodos + "]";
    }

}