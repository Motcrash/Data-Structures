public class App {
    public static void main(String[] args) throws Exception {
        int[] array = new int[100];
        llenarArreglo(array);
        imprimirArreglo(array);

    }

    public static void llenarArreglo(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = 100;
        }
    }

    public static void imprimirArreglo(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
