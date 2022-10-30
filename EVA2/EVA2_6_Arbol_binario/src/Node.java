public class Node {
    private int value;
    private Node leftNode;
    private Node rightNode;

    public Node(){
        this.value = 10;
        this.rightNode = null;
        this.leftNode = null;
    }

    public Node(int value){
        this.value = value;
        this.rightNode = null;
        this.leftNode = null;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    } 

    public Node getLeftNode() {
        return leftNode;
    }
    
    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
}
