import javax.naming.spi.DirStateFactory.Result;

public class EVA1_19_GCD {
    public static void main(String[] args) throws Exception {
        double dividendo = 28, divisor = 21; 
        System.out.println(greatesCommonDivisor(dividendo, divisor));

    }

    public static double greatesCommonDivisor(double n1, double n2) {
        if(n1%n2!=0){
            return greatesCommonDivisor(n1, n1%n2);
        }else return n2;        
    }
}
