package structures.trees;

import structures.node.Nodes;

public class InteTree {

    private Nodes<Integer> root;
    private int peso;
  
    // Clase de arbol solo de enteros.


    //Constructor
    public InteTree() {
        this.root = null;
        this.peso=0;
    }


    public Nodes<Integer> getRoot() {
        return root;
    }

    public int getPeso(){
        return peso;
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
    
    public void preOrden(){
        preOrdenRecursivo(root);
    }


    private void preOrdenRecursivo(Nodes<Integer> actual) {
       if(actual == null)
        return ;
        System.out.println(actual);
        preOrdenRecursivo(actual.getLeft());
        preOrdenRecursivo(actual.getRight());
    }

    public void postOrden(){
        postOrdenRecursivo(root);
    }


    private void postOrdenRecursivo(Nodes<Integer> actual) {
       if(actual== null)
        return ;
        postOrdenRecursivo(actual.getLeft());
        postOrdenRecursivo(actual.getRight());
        System.out.println(actual);
        
        
    }

      public void intOrden(){
        intOrdenRecursivo(root);
    }


    private void intOrdenRecursivo(Nodes<Integer> actual) {
       if(actual== null)
        return ;
        
        intOrdenRecursivo(actual.getLeft());
        System.out.println(actual);
         intOrdenRecursivo(actual.getRight());
         
    }
      public int getHeigth(){
        return getHeigthRecursivo(root);
    }


      private int getHeigthRecursivo(Nodes<Integer> actual) {
        if(actual == null)
            return 0;

        int heigthLeft = getHeigthRecursivo(actual.getLeft());
        int heigthReigth = getHeigthRecursivo(actual.getRight());

        int masAlto = Math.max(heigthLeft, heigthReigth);
        return masAlto+1;
      } 

       public int getpeso(){
        return getPesoRecursivo(root);
    }


      private int getPesoRecursivo(Nodes<Integer> actual) {
        if(actual == null)
            return 0;
        int peso = 0;
        int heigthLeft = getHeigthRecursivo(actual.getLeft());
        int heigthReigth = getHeigthRecursivo(actual.getRight());

        
        return 1 + heigthLeft + heigthReigth;
      } 

}
