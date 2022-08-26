package eva1_7_medir_tiempo;

//  @author Gerardo Delgado
public class Eva1_7_Medir_tiempo {
    public static void main(String[] args) {
        long ini = System.nanoTime();
        int[] data = new int[100000000];
        for (int i : data) {
            data[i] = 100;
            
        }
        long fin = System.nanoTime();
        long tiempo = fin - ini;
        System.out.println((double)tiempo/1000000000);
    }
    
}
