import java.util.Scanner;
public class EVA2_1_Listas_simples {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        List list2 = new List();
        int count=0;  
        for (int i = 1; i < 10; i++) {
            count+=list2.add(i*10);
        }
        System.out.print("Ingrese la posición que desea imprimir: ");
        int position = scan.nextInt();
        list2.printIn(position-1, count);        

    }

    

    
}
