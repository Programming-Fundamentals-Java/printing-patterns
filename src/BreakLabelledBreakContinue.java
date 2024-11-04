public class BreakLabelledBreakContinue {
    public static void main(String[] args) {
        //Break
        //used to terminate the loop based on the condition

        /*
        1 1
        1 2
        1 3
        2 1
        2 2
        2 3
        3 1
        3 2
        3 3
         */

        // break

        for(int i = 1;i <= 3 ; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 3)
                    break; //breaks the inner loop
                System.out.println(i + " " + j);
            }
        }

        System.out.println( " ---------Labelled Break---------");

        outer: for(int i = 1 ; i <= 3 ; i ++) {
            inner1:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 3)
                    break outer; //breaks the outer loop
                System.out.println(i + " " + j);
            }
        }

        //continue statement - skips only the current iteration
        System.out.println("--------- continue statement --------");

        for(int i = 1; i <= 3 ; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == j)
                    continue;
                System.out.println(i + " " + j);
            }
        }
    }
}
