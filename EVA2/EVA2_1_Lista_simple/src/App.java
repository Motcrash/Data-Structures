public class App {
    public static void main(String[] args) throws Exception {
        List list2 = new List();
        int count=0;
        
        System.out.println(count);
        // try {
        //     count+=list2.addIn(7, 9, count);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        for (int i = 1; i < 10; i++) {
            count+=list2.add(i*10);
        }
        list2.addIn(9, 2, count);
        list2.print();
    }

    
}
