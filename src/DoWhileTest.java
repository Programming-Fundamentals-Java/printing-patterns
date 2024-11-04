public class DoWhileTest {
    public static void main(String[] args) {
        /*
        Syntax:
        do{
        //code
        } while(expression);
        */

        //Print nos from 1 to 10
        byte no = 1;
        do {
            System.out.println("No : " + no);
            no++;
        } while (no >= 10);
    }
}
