class Node {
    public int value;
    public Node left;
    public Node right;
}

public class BST {
    public Node root;

    public Node createNode(int value) {
        Node node = new Node();
        node.value = value;
        node.left = null;
        node.right = null;
        return node;
    }

    public boolean checkIfBST(Node node) {
    return checkIfBSTHelper(node, null, null);
    }

    private boolean checkIfBSTHelper(Node node, Integer minValue, Integer maxValue) {
    if (node == null) {
        return true;
    }
    
    if (minValue != null && node.value <= minValue) {
        return false;
    }
    
    if (maxValue != null && node.value >= maxValue) {
        return false;
    }

    return checkIfBSTHelper(node.left, minValue, node.value) &&
           checkIfBSTHelper(node.right, node.value, maxValue);
    }
}