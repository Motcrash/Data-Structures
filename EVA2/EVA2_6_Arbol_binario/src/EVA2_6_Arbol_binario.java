import java.util.Scanner;

public class EVA2_6_Arbol_binario {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        BinaryTree tree1 = new BinaryTree();
        int value;
        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese el valor a agregar: ");
            value = scan.nextInt();
            tree1.addNode(value);
        }
        tree1.inOrder();
        tree1.postOrder();
        tree1.preOrder();
    }
}
