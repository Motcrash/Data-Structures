public class App {
    public static void main(String[] args) throws Exception {
        int a=0,b=1,c=0, limit=0;
        System.out.println(fibonnacci(a, b, c, limit));
    }

    public static String fibonnacci(int a, int b,int c, int limit) {
        if(limit<5){
            // c=a;
            // a=b;
            // b=c+a;
            limit++;
            return fibonnacci(b=c+a, c=a, a=b, limit);
        }else{ return "Valor: "+b;}
    }
}