public class Node {

    private int value;
    private int layer;
    private Node parent;
    private Node leftChild;
    private Node rightChild;

    // Leaf constructor
    public Node(int value, int sizeOfArray) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
        this.parent = null;
        this.layer = log2(sizeOfArray);
    }

    // Internal node constructor
    public Node(Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.leftChild.setParent(this);
        this.rightChild = rightChild;
        this.rightChild.setParent(this);
        this.parent = null;
        this.layer = leftChild.getLayer() - 1;

        if (this.layer % 2 == 1) {
            // Take the lower of the two children
            this.value = Math.min(leftChild.getValue(), rightChild.getValue());
        } else {
            // Take the higher of the two children
            this.value = Math.max(leftChild.getValue(), rightChild.getValue());
        }
    }

    // Getter and setter methods
    public int getValue() {
        return this.value;
    }

    public int getLayer() {
        return this.layer;
    }

    public Node getParent() {
        return this.parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    // Layer calculator
    public static int log2(int x) {
        return (int) (Math.log(x) / Math.log(2));
    }
}