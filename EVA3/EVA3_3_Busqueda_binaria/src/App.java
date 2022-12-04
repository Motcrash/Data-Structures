import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] dataArray = new int[15];
        int[] selectionArray = new int[dataArray.length];
        
        System.out.println("Arreglo original: ");
        fill(dataArray);
        print(dataArray);
        
        System.out.println("Selection Sort");
        copy(dataArray, selectionArray);
        print(selectionArray);
        selectionSort(selectionArray);
        print(selectionArray);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor a buscar: ");
        int search = sc.nextInt();
        System.out.println("");
        System.out.println("El valor está en la posición: " + binarySearch(selectionArray, search));
    }

    public static void fill(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
    }

    public static void print(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] < 10)
            System.out.print("[" + arreglo[i] + "]");
            else
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }

    public static void copy(int[] arreglo, int[] copia){
        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = arreglo[i];
        }
    }
    public static void selectionSort(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            int min = i;
            for (int j = i+1; j < arreglo.length; j++) {
             if(arreglo[min] > arreglo[j])
                 min = j;
            }

            if(min != i){
                int temp = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = temp;
            }
        }
    }
    
    public static int binarySearch(int[] datos, int valor){
        return binaryRecursiveSearch(datos,0,datos.length-1, valor);
    }
    private static int binaryRecursiveSearch(int[] datos, int ini, int fin, int valor){
        int mid = ini + ((fin-ini)/2);
        int resu = -1;
        if(ini < fin){ 
            if(valor == datos[mid])
                resu = mid; 
            else if(valor < datos[mid]) 
                resu = binaryRecursiveSearch(datos, ini, mid-1, valor);
            else 
                resu = binaryRecursiveSearch(datos, mid+1, fin, valor);
        }
        return resu;
    }
}
