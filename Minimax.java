import java.util.ArrayList;

public class Minimax {

    private Node head;

    public Minimax(int[] leaves) {
        ArrayList<Node> children = new ArrayList<Node>();
        ArrayList<Node> parents = new ArrayList<Node>();

        for (int i = 0; i < leaves.length; i++) {
            children.add(new Node(leaves[i], leaves.length));
        }

        while(children.size() > 1) {
            for (int i = 0; i < children.size(); i += 2) {
                parents.add(new Node(children.get(i), children.get(i + 1)));
            }

            children.clear();
            for (int i = 0; i < parents.size(); i++) {
                children.add(parents.get(i));
            }

            parents.clear();
        }

        this.head = children.get(0);
    }

    public Node getHead() {
        return this.head;
    }


    public static void main(String[] args) {

        Minimax test = new Minimax(new int[] {1, 2, 3, 4, 5, 6, 7, 8});
        System.out.println(test.getHead().getValue()); // Should be 6

        Minimax test1 = new Minimax(new int[] {-10, 40, 20, 100});
        System.out.println(test1.getHead().getValue()); // Should be 20

        Minimax test2 = new Minimax(new int[] {0, 5, -5, 10, 7, 8, 1, 1, 3, -6, 9, 8, 14, -8, 6, -1});
        System.out.println(test2.getHead().getValue()); // Should be 0
        System.out.println(test2.getHead().getLeftChild().getValue()); // Should be 0
        System.out.println(test2.getHead().getRightChild().getValue()); // Should be -1

        Minimax test3 = new Minimax(new int[] {-1, 1});
        System.out.println(test3.getHead().getValue()); // Should be 1

    }
}