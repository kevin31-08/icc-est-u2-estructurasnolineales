package structures.trees.Ejercicio_02_invert;

import structures.node.Nodes;
import structures.trees.BinaryTree;

public class InvertBinaryTree {

        public Nodes<Integer>  insert(int [] numeros){
        // CREAR EL ARBOL ENTEROS 
        BinaryTree arbol = new BinaryTree<>();
        //INSERTAR CADA NUMERO
        for(int numero : numeros){
            arbol.add(numero);
        }
         Nodes<Integer> root = arbol.getRoot();
                if (root == null) {
            System.out.println("El árbol está vacío");
            return null;
        }
        //IMPRIMIR ARBOL 
       printInvertido(root);
       return root;
    }



    public void printInvertido(Nodes<Integer> root){
        System.out.println("IMPRESION ARBOL VERTICAL");
        printInvertirRecursivo(root,0);
    }
    private void printInvertirRecursivo(Nodes<Integer> root, int nivel){
         if (root == null) {
        return;  
    }
       printInvertirRecursivo(root.getLeft(), nivel+1);
        for (int i = 0; i < nivel; i++) {
        System.out.print("    ");
        }

        System.out.println(root.getValue());

        printInvertirRecursivo(root.getRight(), nivel+1);
    }
}
