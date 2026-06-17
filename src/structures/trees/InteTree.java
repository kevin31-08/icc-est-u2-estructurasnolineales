package structures.trees;

import structures.node.Nodes;

public class InteTree {

    private Nodes<Integer> root;

  
    // Clase de arbol solo de enteros.


    //Constructor
    public InteTree() {
        this.root = null;
    }


    public Nodes<Integer> getRoot() {
        return root;
    }


    public void setRoot(Nodes<Integer> root) {
        this.root = root;
    }
    public void serRoot(Integer value){
        Nodes<Integer> node = new Nodes<Integer>(value);
        this.root = node;
    }


    public void add(int value) {
      Nodes<Integer> node = new Nodes<Integer>(value);
      root = addRecusrivo(root ,node);
      

    }


    private Nodes<Integer> addRecusrivo(Nodes<Integer> actual, Nodes<Integer> nodeInsertar) {
        if(actual == null)
            return nodeInsertar;
        if(actual.getValue() > nodeInsertar.getValue()){
            //IZQUIERDA 
            actual.setLeft(addRecusrivo(actual.getLeft(), nodeInsertar));
        }else{
            actual.setRight(addRecusrivo(actual.getRight(), nodeInsertar));
        }
        return actual;
    }
    

}
