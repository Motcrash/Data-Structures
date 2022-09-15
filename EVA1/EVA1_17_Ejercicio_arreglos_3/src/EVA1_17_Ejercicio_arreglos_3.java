public class EVA1_17_Ejercicio_arreglos_3 {
    public static void main(String[] args) throws Exception {
        int[][] arrayData = new int[5][5];
        int[][] arrayCopy = new int[arrayData.length][arrayData[arrayData.length-1].length];
        int count = 0;
        //filling the first array
        for (int i = 0; i < arrayData.length; i++) {
            for (int j = 0; j < arrayData[i].length; j++) {
                count++;
                arrayData[i][j] = count;
            }
        }
        backwards(arrayData, arrayCopy);
        print(arrayData);
        print(arrayCopy);
    }

    public static void backwards(int[][] arrayData, int[][] arrayCopy) {
        //Method to fill backwards
        int count1 = 0;
        int count2 = 0;
        for (int i = arrayData.length-1; i>=0; i--) {
            for (int j = arrayData[i].length-1; j>=0; j--) {
                arrayCopy[count1][count2] = arrayData[i][j];
                if(count2<4){
                    count2++;
                }else count2 = 0;
            }
            if(count1<4){
                count1++;
            }else count1 = 0;
        }
    }

    public static void print(int[][] arrayToPrint) {
        //Method to print the arrays
        for (int i = 0; i < arrayToPrint.length; i++) {
            for (int j = 0; j < arrayToPrint[i].length; j++) {
                if(j==4){
                    System.out.println("["+arrayToPrint[i][j]+"] ");
                }else System.out.print("["+arrayToPrint[i][j]+"] ");
            }
        }
        System.out.println();
        System.out.println("--------------------------");
    }
}
