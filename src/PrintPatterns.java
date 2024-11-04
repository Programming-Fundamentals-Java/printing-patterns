import java.util.Scanner;

public class PrintPatterns {
    public static void main(String[] args) {
        /*
        Half Pyramid Pattern
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        *

        */

        System.out.println("Enter No of Lines : ");
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        for (int i = 1; i <= lines; i++) { // iterate through the Lines from 1 to lines
            for (int j = 1; j <= 1; j++) { // iterate the no of occurrences
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = lines - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
         */

        int no = 1;
        for(int i = 1; i <= lines; i++){
            for(int j= 1; j <= i; j++){
                System.out.print(no + " ");
                no++;
            }
            System.out.println();
        }
    }
}