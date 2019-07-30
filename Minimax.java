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
        System.out.println(test.getHead().getValue());

    }
}