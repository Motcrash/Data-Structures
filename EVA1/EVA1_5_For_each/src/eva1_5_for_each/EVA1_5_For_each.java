package eva1_5_for_each;

//  @author Gerardo Delgado
public class EVA1_5_For_each {
    public static void main(String[] args) {
        int [] arrData = new int [50];
        
        for (int i = 0; i < arrData.length; i++) {
            arrData[i] = (int)(Math.random()*100);
        }
        
        for (int i : arrData) {
            System.out.print("["+ i + "]");
        }
    }
    
}
