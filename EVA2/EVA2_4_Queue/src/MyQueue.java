public class MyQueue {
    private Node init;
    private Node last;
    private int listSize;

    public MyQueue(){
        this.init = null;
        this.last = null;
        this.listSize = 0;
    }

    public  void printList() {
        if (listSize == 0) {
            System.out.println("No hay elementos que imprimir");
        }else{
            Node temp = init;
            while(temp!=null){
                System.out.print("("+temp.getValue()+") > ");
                temp = temp.getNext();
            }
        }
        System.out.println();
        
    }

    public void clearList(){
        init = null;
        last = null;
        listSize = 0;
    }

    public void printIn(int position) throws Exception{
        if(position<0 || position>listSize){
            throw new Exception("Fuera de los limites de la lista");
        }
        else{
            Node temp = init;
            for (int i = 0; i <= position; i++) {
                if(i==position){
                    System.out.println(temp.getValue());
                }
                temp = temp.getNext();
            }
        }
    }

    public void add(int value) {
        Node newNode = new Node(value);

        if(this.init==null){
            init = newNode;
            last = newNode;
        }else{
            last.setNext(newNode);
            newNode.setPrev(last);
            last = newNode;
            
        }
        listSize++;
    }

    public void addIn(int value, int position) throws Exception{
        if(position<0 || position>listSize){
            throw new Exception("Fuera de los limites de la lista");
        }else{
            Node temp = init;
            Node newNode = new Node(value);
            if(position==0){
                newNode.setNext(init);
                newNode.setPrev(null);
                init = newNode;
            }else{
                for (int i = 1; i < position; i++) {
                    temp = temp.getNext();
                }
                newNode.setNext(temp.getNext());
                newNode.setPrev(temp);
                newNode.getNext().setPrev(newNode);
                temp.setNext(newNode);
            }
            listSize++;
        }
        
    }
    
    public void deleteIn( int position) throws Exception{
        if(position<0 || position>listSize){
            throw new Exception("Fuera de los limites de la lista");
        }else if(listSize == 1){
            System.out.println("Tamaño lista 1");
            clearList();
            listSize=0;
        }
        else{
            Node temp = init;
            Node prev = null; 
            if(position==0){
                init = init.getNext();
                init.setPrev(null);
            }if(position == listSize-1){
                System.out.println("Valor previo: "+last.getPrev().getValue());
                System.out.println("Valor previo: "+last.getPrev().getPrev().getValue());
                last.getPrev().setNext(null);
                last = last.getPrev();
            }
            else{
                for (int i = 0; i < position; i++) {
                    temp = temp.getNext();
                    if(position == 1 ){
                        prev = init;
                    }else{
                        if(i==position-2){
                            prev = temp;
                            if(position==listSize-1){
                                last=prev;
                            }
                        }
                    }
                }
                prev.setNext(temp.getNext());
                temp.getNext().setPrev(prev);
                
            }
            listSize--;
        }
    }

    public void printListBackwards() {
        if (listSize == 0) {
            System.out.println("No hay elementos que imprimir");
        }else{
            Node temp = last;
            while(temp!=null){
                System.out.print("("+temp.getValue()+") > ");
                temp = temp.getPrev();
            }
        }
        System.out.println();
        
    }

    public int peek() throws Exception{
        if(listSize==0){
            throw new Exception("La lista está vacía");
        }else return init.getValue();
    }

    public int poll() throws Exception{
        if(listSize==0){
            throw new Exception("La lista está vacía");
        }else {
            deleteIn(listSize-1);
            listSize--;
            return last.getValue();
        }
    }
}
