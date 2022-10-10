public class Node {
    private int x;
    private Node next;
    private Node prev;

    public Node(){
        this.x = 10;
        this.next = null;
        this.prev = null;
    }

    public Node(int value){
        this.x = value;
        this.next = null;
        this.prev = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    } 

    public Node getPrev() {
        return prev;
    }
    
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public int getValue() {
        return x;
    }
    
    public void setValue(int x) {
        this.x = x;
    }
}
