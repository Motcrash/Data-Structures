import java.util.Scanner;

public class List {
    Scanner scan = new Scanner(System.in);
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

    public  void printList(int count) {
        if (count == 0) {
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

    public int addIn(int value, int position, int listSize) throws Exception{
        if(position<0 || position>listSize){
            throw new Exception("Fuera de los limites de la lista");
        }else{
            Node temp = init;
            Node newNode = new Node(value);
            if(position==0){
                newNode.setNext(init);
                init = newNode;
            }else{
                for (int i = 1; i < position; i++) {
                    temp = temp.getNext();
                }
                newNode.setNext(temp.getNext());
                temp.setNext(newNode);
            }
            
            return 1;
        }
        
    }

    public int clearList(){
        init = null;
        last = null;
        return 0;
    }

    public int deleteIn( int position, int listSize) throws Exception{
        if(position<0 || position>listSize){
            throw new Exception("Fuera de los limites de la lista");
        }else if(listSize == 1){
            clearList();
            return -1;
        }
        else{
            Node temp = init;
            Node prev = null; 
            if(position==0){
                init = init.getNext();
            }else{
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
            }
            
            return -1;
        }
    }
    public void printIn(int position, int listSize) throws Exception{
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

    public boolean voidList() {
        if(init==null){
            return true;
        }else{
            return false;
        }
    }
}
