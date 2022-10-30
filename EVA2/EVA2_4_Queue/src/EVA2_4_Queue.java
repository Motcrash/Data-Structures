import java.util.Scanner;

public class EVA2_4_Queue {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        MyQueue list1 = new MyQueue();
        for (int i = 1; i <= 10; i++) {
            list1.add(i*10);
        }
        menu(list1);
    }

    public static void menu(MyQueue list1) throws Exception {
        String option;
        int value, position;
        boolean repeat = true;

        while(repeat){
            do {
                System.out.println("Seleccione una operación: \na) Agregar un valor al final \nb) Agregar un valor en una posición \n"+
                "c) Borrar la lista \nd) Borrar un valor en la lista \ne) peek \nf) poll");
                option = scan.next();
            } while (!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b") 
            && !option.equalsIgnoreCase("c") && !option.equalsIgnoreCase("d")
            && !option.equalsIgnoreCase("e") && !option.equalsIgnoreCase("f"));
            switch (option.toLowerCase()) {
                case "a":
                    System.out.print("Ingrese el valor que desea agregar: ");
                    value = scan.nextInt();
                    list1.add(value);
                    break;
                case "b":
                    System.out.print("Ingrese el valor que desea agregar: ");
                    value = scan.nextInt();
                    System.out.print("Ingrese la posición donde se desea agregar: ");
                    position = scan.nextInt();
                    list1.addIn(value, position-1);
                    break;
                case "c": 
                    list1.clearList();
                    break;
                case"d":
                    System.out.print("Ingrese la posición donde se desea eliminar: ");
                    position = scan.nextInt();
                    list1.deleteIn(position-1);     
                    break;
                case"e": 
                    System.out.println(list1.peek());
                    break;
                case"f":
                    System.out.println(list1.poll()); 
                    break;
                }
            list1.printList(); 
            list1.printListBackwards();
            System.out.println();
            System.out.println("Desea realizar otra acción?: \na) sí \nb) no");
            option = scan.next();
            repeat = (option.equalsIgnoreCase("a")) ? true : false;
            System.out.println();
        }
    }
}
