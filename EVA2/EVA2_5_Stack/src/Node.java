public class Node {
    private int value;
    private Node next;
    private Node prev;

    public Node(){
        this.value = 10;
        this.next = null;
        this.prev = null;
    }

    public Node(int value){
        this.value = value;
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
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
}