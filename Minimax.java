import java.util.Scanner;

public class Minimax {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the array of numbers: ");
        String input = s.nextLine();
        String[] array = input.split(" ");
        Node[] leaves = new Node[array.length];

        for (int i = 0; i < array.length; i++) {
            leaves[i] = new Node(Integer.parseInt(array[i]), array.length);
        }

    }
}