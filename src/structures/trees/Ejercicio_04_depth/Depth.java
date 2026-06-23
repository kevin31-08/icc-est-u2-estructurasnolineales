package structures.trees.Ejercicio_04_depth;

import structures.node.Node;
import structures.node.Nodes;

public class Depth {
    public int maxDepth(Nodes<Integer>  root) {
    if (root == null) {
        return 0;
    }

    int leftDepth = maxDepth(root.getLeft());
    int rightDepth = maxDepth(root.getRight());

    return 1 + Math.max(leftDepth, rightDepth);
}
}
