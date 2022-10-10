import java.util.LinkedList;

public class EVA2_2_Tipos_datos_genericos {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        // list1.
        TiposDatosGenericos<Integer> myObject = new TiposDatosGenericos<>();
        myObject.setValue(100);
        System.out.println(myObject.getValue());
    }
}

class TiposDatosGenericos<T>{
    private T value;

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}
