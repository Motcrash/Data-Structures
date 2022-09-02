import java.util.Scanner;

import javax.imageio.ImageIO;

public class EVA1_11_Ejemplo_arreglos{
    public static void main(String[] args) throws Exception {
        int studentsNum;
        double studentCal;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de grupos que desea asignar: ");
        System.out.println();
        int groups = scan.nextInt();
        double[][] arrayGroups = new double[groups][];
        for (int i = 0; i < arrayGroups.length; i++) {
            System.out.print("Ingrese la cantidad de alumnos que tiene el grupo "+(i+1)+":");
            studentsNum = scan.nextInt();
            arrayGroups[i] = new double[studentsNum];
            for(int j=0; j<arrayGroups[i].length; j++){
                System.out.print("Ingrese la calificación del alumno "+(j+1)+":");
                studentCal = scan.nextDouble();
                arrayGroups[i][j] = studentCal;
                if (j==arrayGroups[i].length-1) {
                    System.out.println("------------------------------------------------");
                }
            }
        }
    }
}
