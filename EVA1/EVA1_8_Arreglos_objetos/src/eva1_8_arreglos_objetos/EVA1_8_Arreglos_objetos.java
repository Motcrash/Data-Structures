package eva1_8_arreglos_objetos;

//   @author Gerardo Delgado
public class EVA1_8_Arreglos_objetos {
    public static void main(String[] args) {
        Prueba arregloPrueba[] = new Prueba[20];
        int counter = 0;
        for (Prueba i : arregloPrueba) {
             arregloPrueba[counter] = new Prueba();
             System.out.println("valor de x = "+arregloPrueba[counter].x);
             counter++;
        }
        
    }
}
    
class Prueba{
    int x = 100;
}
