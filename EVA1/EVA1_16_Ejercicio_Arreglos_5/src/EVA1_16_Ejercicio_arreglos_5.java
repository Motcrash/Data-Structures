public class EVA1_16_Ejercicio_arreglos_5 {
    public static void main(String[] args){
        int[] arrayNumbers = new int[50];
        int[] arrayPairs = new int[arrayNumbers.length];
        fill(arrayNumbers, arrayPairs);
        print(arrayNumbers);
        print(arrayPairs);
    }

    public static void fill(int[] arrayNumbers, int[] arrayPairs) {
        for (int i = 0; i < (arrayNumbers.length-1); i++) {
            arrayNumbers[i] = (int) ((Math.random()) *100 + 1);
            if(arrayNumbers[i]%2==0){
                arrayPairs[i] = arrayNumbers[i];
            }
        }
    }

    public static void print(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
        if(arrayToPrint[i] != 0){
            System.out.print("["+arrayToPrint[i]+"] ");
        }
        }
        System.out.println();
        System.out.println("-------------------------------");
    }
}
