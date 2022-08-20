package eva1_1_stack;

//@author Gerardo Delgado

public class EVA1_1_Stack {
    
    public static void main(String[] args) {
        System.out.println("Inicia main");
        A();
        System.out.println("Retoma ejecución main");
        System.out.println("Termina Main");
    }
    
    public static void A(){
        System.out.println("Inicia A");
        B();
        System.out.println("Retoma ejecución A");
        System.out.println("Termina A");
    }
    
    public static void B(){
        System.out.println("Inicia B");
        int i = 1;
        double d = 2.5;
        System.out.println("Termina B");
    }
    
}
