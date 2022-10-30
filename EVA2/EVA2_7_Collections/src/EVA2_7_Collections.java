import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class EVA2_7_Collections {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        LinkedList list1 = new LinkedList<String>();
        list1.add("Hola");
        list1.add("");
        list1.add("Mundo");
        System.out.println(list1);
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        ArrayList arrayList1 = new ArrayList<Integer>();
        arrayList1.add(100);
        arrayList1.add(200);
        arrayList1.add(300);
        arrayList1.add(400);
        arrayList1.add(500);
        
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }
    }
}
