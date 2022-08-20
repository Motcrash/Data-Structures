package eva1_2_stackoverflow;

//@author Gerardo Delgado

public class EVA1_2_StackOverflow {
    static int counter = 0;
    public static void main(String[] args) {
        A();
    }
    
    public static void A(){
        B();
    }
    
    public static void B(){
        counter++;
        System.out.println(counter);
        
        A();
    }
    
}
