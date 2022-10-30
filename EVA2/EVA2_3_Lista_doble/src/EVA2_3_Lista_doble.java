import java.util.Scanner;
public class EVA2_3_Lista_doble {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Lista_doble list1 = new Lista_doble();
        for (int i = 1; i <= 10; i++) {
            list1.add(i*10);
        }
        menu(list1);
    }

    public static void menu(Lista_doble list2) throws Exception {
        String option;
        int value, position;
        boolean repeat = true;

        while(repeat){
            do {
                System.out.println("Seleccione una operación: \na) Agregar un valor al final \nb) Agregar un valor en una posición \n"+
                "c) Borrar la lista \nd) Borrar un valor en la lista");
                option = scan.next();
            } while (!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b") 
            && !option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("d"));
            switch (option.toLowerCase()) {
                case "a":
                    System.out.print("Ingrese el valor que desea agregar: ");
                    value = scan.nextInt();
                    list2.add(value);
                    break;
                case "b":
                    System.out.print("Ingrese el valor que desea agregar: ");
                    value = scan.nextInt();
                    System.out.print("Ingrese la posición donde se desea agregar: ");
                    position = scan.nextInt();
                    list2.addIn(value, position-1);
                    break;
                case "c": 
                    list2.clearList();
                    break;
                case"d":
                    System.out.print("Ingrese la posición donde se desea eliminar: ");
                    position = scan.nextInt();
                    list2.deleteIn(position-1);     
                    break;
                }
            list2.printList(); 
            list2.printList();
            System.out.println("Desea realizar otra acción?: \na) sí \nb) no");
            option = scan.next();
            repeat = (option.equalsIgnoreCase("a")) ? true : false;
        }
    }
}


