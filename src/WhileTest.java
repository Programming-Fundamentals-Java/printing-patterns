public class WhileTest {
    public static void main(String[] args) {
        /*
        while(condition){
        //code
        }
         */

        //Print numbers from 1 to 10
        byte no = 1;
        while (no <= 10) {
            System.out.println("No:" + no);
            //no++;
            no += 2;
        }

        //Print even numbers from 1 to 100
        byte number = 1;
        while (number <= 100) {
            //code to check if the no is even
            if (number % 2 == 0)
                System.out.println(number);

            number++;
        }
    }
}
