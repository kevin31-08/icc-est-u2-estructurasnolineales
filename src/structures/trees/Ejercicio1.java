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
         Nodes<Integer> root = arbol.getRoot();
                if (root == null) {
            System.out.println("El árbol está vacío");
            return;
        }
        //IMPRIMIR ARBOL 
       printTree(root);
       printInvertido(root);
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
            System.out.print("    ");
        }
         System.out.println(root.getValue());
        printTreeRecursivo(root.getLeft(),nivel+1);
       
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
