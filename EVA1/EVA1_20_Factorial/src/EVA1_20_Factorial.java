public class EVA1_20_Factorial{
    public static void main(String[] args) throws Exception {
        int n = 4, x=n;
        System.out.println(factorial(n,x));
    }

    public static int factorial(int n, int x) {
        if (x>1) {
            n = n*(x-1);
            x--;
            return factorial(n,x);
        } else {
           return n;
        }

    }
}
