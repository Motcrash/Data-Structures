public class EVA3_1_Ordenamientos {
    public static void main(String[] args) throws Exception {
        int[] array = new int[10];
        int[] selectionSort = new int[array.length];
        int[] insertionSort = new int[array.length];
        int[] quickSort = new int[array.length];
        fillArray(array);

        System.out.println("Arreglo original: ");
        printArray(array);
        copyArray(array, selectionSort);
        copyArray(array, insertionSort);
        copyArray(array, quickSort);
        
        System.out.println("selectionSort array: ");
        selectionSort(selectionSort);
        System.out.println("insertionSort array: ");
        insertionSort(insertionSort);
        System.out.println("quickSort array: ");
        quickSort(quickSort);
        // System.out.println("insertionSort array: ");
        // quickSort(quickSort);

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

    public static void quickSort(int array[]) {
        quickSortRec(array, 0, array.length - 1);
        printArray(array);
    }

    private static void quickSortRec(int array[], int start, int end) {
        int pivote, smallIndex, bigIndex, temp;
        pivote = start;
        smallIndex = end;
        bigIndex = start;
        if(start<end){
        while (bigIndex < smallIndex) {
            while (array[bigIndex] <= array[pivote] && (bigIndex < smallIndex)) {
             
                bigIndex++;
            }
            while (array[smallIndex] > array[pivote]) {
             
                smallIndex--;
                
            }

            if (bigIndex < smallIndex) {
                temp = array[bigIndex];
                array[bigIndex] = array[smallIndex];
                array[smallIndex] = temp;                
            }
        }
        temp = array[pivote];
        array[pivote] = array[smallIndex];
        array[smallIndex] = temp;
        pivote = smallIndex;
        
        quickSortRec(array,start,pivote-1);
        quickSortRec(array,pivote+1,end);
        }
    }

}

    

