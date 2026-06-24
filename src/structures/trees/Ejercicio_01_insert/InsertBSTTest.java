package structures.trees.Ejercicio_01_insert;

import structures.node.Nodes;
import structures.trees.BinaryTree;

public class InsertBSTTest {
    public Nodes<Integer> insert(int [] numeros){
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
       printTree(root);
       return root;
    }
    public void printTree(Nodes<Integer> root){
        System.out.println("IMPRIMIENDO EL ARBOL (ejercici01): ");
        printTreeRecursivo(root,0);
    }
    private void printTreeRecursivo(Nodes<Integer> root, int nivel) {
         if(root == null)
        return ;
        printTreeRecursivo(root.getRight(),nivel+1);
        for(int i = 0; i< nivel;i++){
            System.out.print("    ");
        }
         System.out.println(root.getValue());
        printTreeRecursivo(root.getLeft(),nivel+1);
       
    }

    
}
