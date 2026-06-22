package structures.trees;

import structures.node.Nodes;

public class Ejercicio1 {
    public void insert(int [] numeros){
        // CREAR EL ARBOL ENTEROS 
        BinaryTree arbol = new BinaryTree<>();
        //INSERTAR CADA NUMERO
        for(int numero : numeros){
            arbol.add(numero);
        }
        //IMPRIMIR ARBOL 
        arbol.intOrden();
    }
    public void printTree(Nodes<Integer> root){
        System.out.println("IMPRIMIENDO EL ARBOL: ");
        printTreeRecursivo(root,0);
    }
    private void printTreeRecursivo(Nodes<Integer> root, int nivel) {
         if(root == null)
        return ;
        printTreeRecursivo(root.getRight(),nivel+1);
        for(int i = 0; i< nivel;i++){
            System.out.println("\\t");
        }
         System.out.println(root.getValue());
        printTreeRecursivo(root.getLeft(),nivel+1);
       
    }
    private void invertirRecursivo(Nodes<Integer> root, int nivel){
        if (root == null ) {
            return;
        printTreeRecursivo(root.getRight(),nivel+1);
        for(int i = 0; i< nivel;i++){
            System.out.println("\\t");
        }
         System.out.println(root.getValue());
        printTreeRecursivo(root.getLeft(),nivel+1);
        }
    }
}
