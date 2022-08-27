public class EVA1_10_Arreglo_cubo {
    public static void main(String[] args) throws Exception {
        int[][][] cuboDatos= new int[3][3][5];
        for (int i = 0; i < cuboDatos.length; i++) {
            System.out.println("Lista "+(i+1));
            for (int j = 0; j < cuboDatos[i].length; j++) {
                for (int k = 0; k < cuboDatos[i][j].length; k++) {
                    cuboDatos[i][j][k] = 100;
                    System.out.println("[" + cuboDatos[i][j][k] + "]");
                }
            }
            System.out.println("-----------------------");
        }
    }
}
