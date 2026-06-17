import structures.trees.InteTree;

public class App {
    public static void main(String[] args) throws Exception {
       runIntTree();
      
    }

    private static void runIntTree() {
       InteTree arbolNumeros = new InteTree();
    //    Nodes<Integer> node1 = new Nodes(50);
    //    Nodes<Integer> node2 = new Nodes<>(10);
    //    Nodes<Integer> node3 = new Nodes<>(30);

    //    arbolNumeros.setRoot(node1);
    //    node1.setRight(node2);
    //    node2.setLeft(node3);
    //     System.out.println(arbolNumeros.getRoot());
    //     System.out.println(arbolNumeros.getRoot().getLeft().getRight());

        arbolNumeros.add(50);
        arbolNumeros.add(10);
        arbolNumeros.add(30);
        arbolNumeros.add(60);
        arbolNumeros.add(75);
        arbolNumeros.add(55);
         System.out.println(arbolNumeros.getRoot());
       System.out.println(arbolNumeros.getRoot().getLeft().getRight());

    }
}
