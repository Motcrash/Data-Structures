public class EVA1_12_Copia_objetos {
    public static void main(String[] args) throws Exception {
        int valor, copiaValor;

        valor = 100;
        copiaValor = valor;

        System.out.println("valor: " + valor);
        System.out.println("copiaValor: " +copiaValor);

        PruebaValor prueba1 = new PruebaValor();
        prueba1.x = 1000;

        PruebaValor pruebaCopia = new PruebaValor();
        pruebaCopia = prueba1;

        System.out.println("prueba1: "+ prueba1.x);
        System.out.println("pruebaCopia: "+ pruebaCopia.x);

        prueba1.x = 2000;
        System.out.println("prueba1: "+ prueba1.x);
        System.out.println("pruebaCopia: "+ pruebaCopia.x);
    }
}

class PruebaValor{
    int x;
}
