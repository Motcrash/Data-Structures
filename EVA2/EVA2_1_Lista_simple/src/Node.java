public class Node {
    private int x;
    private Node next;

    public Node(){
        this.x = 10;
        this.next = null;
    }

    public Node(int value){
        this.x = value;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    } 

    public int getValue() {
        return x;
    }
    
    public void setValue(int x) {
        this.x = x;
    }
}
