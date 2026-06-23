package structures.trees.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import structures.node.Nodes;

public class ListLevels {

    public List<List<Nodes<Integer>>> listLevels(Nodes<Integer> root) {

        List<List<Nodes<Integer>>> resultado = new ArrayList<>();

        if (root == null) {
            return resultado;
        }

        Queue<Nodes<Integer>> cola = new LinkedList<>();
        cola.add(root);

        while (!cola.isEmpty()) {

            int tamaño = cola.size();
            List<Nodes<Integer>> nivel = new ArrayList<>();

            for (int i = 0; i < tamaño; i++) {

                Nodes<Integer> actual = cola.poll();
                nivel.add(actual);

                if (actual.getLeft() != null) {
                    cola.add(actual.getLeft());
                }

                if (actual.getRight() != null) {
                    cola.add(actual.getRight());
                }
            }

            resultado.add(nivel);
        }

        return resultado;
    }
   
}