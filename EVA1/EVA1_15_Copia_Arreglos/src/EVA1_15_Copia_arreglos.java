import java.lang.Math;
public class EVA1_15_Copia_arreglos {
    public static void main(String[] args) throws Exception {
        int[] arrayData = new int[100];
        fill(arrayData);
        int[] arrayCopy = new int[arrayData.length];
        copyBackwards(arrayCopy, arrayData);
        print(arrayData);
        print(arrayCopy);
    }

    public static void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);     
        }
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if((i+1)%5!=0){
                System.out.print("["+array[i]+"] ");
            }else System.out.println("["+array[i]+"] ");
        }
        System.out.println("-------------------------------");
    }

    public static void copyBackwards(int[] arrayCopy, int[] arrayOriginal) {
        int count = 0;
        for (int i = arrayOriginal.length-1; i>=0; i--) {
            arrayCopy[count] = arrayOriginal[i];
            count++;
        }
    }
}
