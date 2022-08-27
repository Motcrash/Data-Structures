public class EVA1_9_Arreglos_multidim {
    public static void main(String[] args) throws Exception {
        int [][] matrizDatos = new int[3][5];
        for (int i = 0; i < matrizDatos.length; i++) {
            for (int j = 0; j < matrizDatos[i].length; j++) {
                matrizDatos[i][j] = 100;
                System.out.print("["+matrizDatos[i][j]+ "] ");
            }
            System.out.println();
        }
    }
}
