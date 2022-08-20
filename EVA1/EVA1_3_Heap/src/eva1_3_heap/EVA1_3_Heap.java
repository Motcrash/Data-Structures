package eva1_3_heap;

// @author Gerardo Delgado

public class EVA1_3_Heap {
    public static void main(String[] args) {
        
        int xd = 10; 
        
        //Los objetos en Java guardan referencias
        Prueba obj = new Prueba();
        Prueba obj2 = new Prueba();
        
        System.out.println(xd);
        System.out.println(obj.valor);
        System.out.println(obj2);
        
    }
    
}

class Prueba{
    int valor = 100;
}
