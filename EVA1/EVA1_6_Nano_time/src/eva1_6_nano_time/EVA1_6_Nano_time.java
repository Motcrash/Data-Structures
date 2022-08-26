
package eva1_6_nano_time;

//   @author Gerardo Delgado
public class EVA1_6_Nano_time {

    public static void main(String[] args) {
        long ini = System.nanoTime();
        System.out.println(ini);
        long fin = System.nanoTime();
        long tiempo = fin - ini;
        System.out.println(tiempo);
    }
    
}
