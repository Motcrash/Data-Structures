public class List {
    private Node init;
    private Node last;

    public List(){
        this.init = null;
        this.last = null;
    }

    public int add(int value){
        Node newNode = new Node(value);

        if(this.init==null){
            init = newNode;
            last = newNode;
        }else{
            last.setNext(newNode);
            last = newNode;
        }
        return 1;
    }

    public  void print() {
        Node temp = init;
        while(temp!=null){
            System.out.print("("+temp.getX()+") >");
            temp = temp.getNext();
        }
    }

    public int addIn(int value, int position, int listSize) throws Exception{
        if(position<0 ){
            throw new Exception("No puede haber valores negativos");
        }else if(position>listSize){
            throw new Exception("Fuera de los limites de la lista");
        }else{
            Node temp = init;
            Node newNode = new Node(91);
            for (int i = 1; i < position; i++) {
                temp = temp.getNext();
            }
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            return 1;
        }
        
    }

    public int size(){
        int count = 0;
        return count;
    }
}
