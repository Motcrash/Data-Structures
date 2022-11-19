public class EVA3_1_Ordenamientos {
    public static void main(String[] args) throws Exception {
        int[] array = new int[10];
        int[] copy = new int[array.length];
        int[] secondCopy = new int[array.length];
        fillArray(array);

        System.out.println("Arreglo original: ");
        printArray(array);
        copyArray(array, copy);
        copyArray(array, secondCopy);
        
        System.out.println("selectionSort array: ");
        selectionSort(copy);
        System.out.println("insertionSort array: ");
        insertionSort(secondCopy);


    }

    public static void fillArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i]<10){
                System.out.print("[0"+array[i]+"] ");
            }else System.out.print("["+array[i]+"] ");
        }
        System.out.println();
    }

    public static void copyArray(int[] array, int[] copy) {
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
    }

    public static void selectionSort(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            min = i;
            // position search
            for (int j = i+1; j < array.length; j++) {
                // searching the minimum
                if(array[min]>array[j]){
                    min = j;
                }
            }
            if(min!=i){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }

        }
        printArray(array);
    }

    public static void insertionSort(int[] array) {
        int temp = 0, insP = 0;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            insP = i;
            for (int prev = i-1; prev >= 0; prev--) {
                if(array[prev] > temp){
                    array[insP] = array[prev];
                    insP--;
                } else break;
            }
            if(temp != array[insP]){
                array[insP] = temp;
            }
        }
        printArray(array);
    }
}
