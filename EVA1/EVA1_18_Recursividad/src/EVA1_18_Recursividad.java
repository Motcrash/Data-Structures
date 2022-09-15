public class EVA1_18_Recursividad {
    public static void main(String[] args) throws Exception {
        int number = 5, init = 1, stop = 5;
        fakeDescendentFor(number);
        System.out.println();
        System.out.println("-------------------------------");
        fakeAscendentFor(init, stop);
    }

    public static void fakeDescendentFor(int value) {
        if (value>0) {
            System.out.print(value + "-");
            fakeDescendentFor(value-1);
        }
    }

    public static void fakeAscendentFor(int start, int end) {
        if(start <= end){
            System.out.print(start + "-");
            fakeAscendentFor(start+1, end);
        }
    }
}
