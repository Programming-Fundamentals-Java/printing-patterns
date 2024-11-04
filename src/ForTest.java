public class ForTest {
    public static void main(String[] args) {
        /*
        Syntax
        for(initialization; expression; operation) {
        //code;
        }
         */

        //Print number from 1 to 10
        for (int no = 1; no <= 10; no++) {
            System.out.println("No : " + no);
        }

        /*
        Example of infinite loop
        for(;true;){
            System.out.println("hello");
        } */

        System.out.println("----------------------------------------");
        //Print number from 18 to 1
        for (int no = 10; no >= 1; no--) {
            System.out.println("No : " + no);
        }

        for(int no = 1; no <= 10 ; System.out.println("No : " + no)){
            no += 2;
        }
    }
}
