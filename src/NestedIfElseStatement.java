import java.util.Scanner;

public class NestedIfElseStatement {
    public static void main(String[] args) {
        /*
        Nested if-else statement
        if(condition) {
        //code
            if(condition) {
            //code
            } else {
            //code
            }
        } else {
        //code
            if(condition) {
            //code
            } else {
            // code
            }
        }

        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Distance in Kms");
        int distance = sc.nextInt();

        System.out.println("Enter Duration");
        int duration = sc.nextInt();

        if (distance >= 10) {
            if (duration < 10) {
                System.out.println("Path A");
            } else {
                System.out.println("Path B");
            }
        } else {
            if (duration >= 10 && duration <= 15) {
                System.out.println("Path C");
            } else {
                System.out.println("Path D");
            }
        }
    }
}