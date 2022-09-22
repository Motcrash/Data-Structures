public class EVA1_21_Recursividad {
    public static void main(String[] args) throws Exception {
        System.out.println("Main " + A());
    }

    public static String A() {
        return "A " + B();
    }
    public static String B() {
        return "B " + C();
    }
    public static String C() {
        return "C";
    }
}
