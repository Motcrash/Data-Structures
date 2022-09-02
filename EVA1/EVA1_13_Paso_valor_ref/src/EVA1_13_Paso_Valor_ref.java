public class EVA1_13_Paso_Valor_ref {
    public static void main(String[] args) throws Exception {
        PruebaValor prueba1 = new PruebaValor();
        prueba1.x = 100;
        System.out.println("Valor inicial: "+prueba1.x);
        incrementarValor(prueba1);
        System.out.println("Valor + 1 : "+prueba1.x);
        incrementarValor(prueba1);
        System.out.println("Valor + 2 : "+prueba1.x);
    }

    public static void incVal(int value){
        value++;
    }

    public static void incrementarValor(PruebaValor prueba1){
        prueba1.x ++;
    }
}

class PruebaValor{
    int x;
}
