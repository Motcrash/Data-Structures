package eva1_4_arreglos;

// @author Gerardo Delgado
public class EVA1_4_Arreglos {

    public static void main(String[] args) {
        int[] arrAge, arrSalary, arrCal;
        double arrAvrg[], percentage;
        arrAge = new int[50];
        for (int i = 0; i < arrAge.length; i++) {
            arrAge[i] = (int)(Math.random()*100);
        }
        
        for (int i = 0; i < arrAge.length; i++) {
            System.out.println("["+(i+1)+"] = "+arrAge[i]);
        }
    }
    
}
