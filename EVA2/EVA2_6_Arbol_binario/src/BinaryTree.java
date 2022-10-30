public class BinaryTree{
    private Node root;

    public BinaryTree(){
        root = null;
    }

    public BinaryTree(int number){
        root.setValue(number);
    }

    public void addNode(int number) {
        Node newNode = new Node(number);
        if(root == null){
            root = newNode;
        }else addRec(number, root);
    }

    private void addRec(int value, Node actualRoot){
        Node newNode = new Node(value);
        if(value < actualRoot.getValue()){
            if(actualRoot.getLeftNode() == null){
                actualRoot.setLeftNode(newNode);
            }else{
                addRec(value, actualRoot.getLeftNode());
            }
        }else if(value > actualRoot.getValue()){
            if(actualRoot.getRightNode() == null){
                actualRoot.setRightNode(newNode);
            }else{
                addRec(value, actualRoot.getRightNode());
            }
        }else {System.out.println("Elemento repetido");}
    }

    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node actualRoot) {
        if(actualRoot!=null){
            inOrderRec(actualRoot.getLeftNode());
            System.out.print("InOrder: " +actualRoot.getValue()+ " - "); 
            inOrderRec(actualRoot.getRightNode());
        }
    }

    public void postOrder() {
        postOrderRec(root);
    }

    private void postOrderRec(Node actualRoot) {
        if(actualRoot!=null){
            postOrderRec(actualRoot.getLeftNode());
            postOrderRec(actualRoot.getRightNode());
            System.out.print("PostOrder: " +actualRoot.getValue()+ " - "); 
        }
    }

    public void preOrder() {
        preOrderRec(root);
    }

    private void preOrderRec(Node actualRoot) {
        if(actualRoot!=null){
            System.out.print("PreOrder: " +actualRoot.getValue()+ " - "); 
            preOrderRec(actualRoot.getLeftNode());
            preOrderRec(actualRoot.getRightNode());
        }
    }
}