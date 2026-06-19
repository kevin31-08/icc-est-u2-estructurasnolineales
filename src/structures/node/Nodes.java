package structures.node;

public class Nodes<T> {
    private T value;
    private Nodes<T> left;
    private Nodes<T> right;
    //Creo un nodo.
    //Intancio el nodo -> constructor
    
    public Nodes(T value) {
        this.value = value;
        this.right = null;
        this.left= null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Nodes<T> getLeft() {
        return left;
    }

    public void setLeft(Nodes<T> left) {
        this.left = left;
    }

    public Nodes<T> getRight() {
        return right;
    }

    public void setRight(Nodes<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Nodes [value=" + value + "]";
    }
    
    

    

}
