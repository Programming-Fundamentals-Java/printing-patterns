import java.util.Scanner;

public class MaxNumberIfElse {
    public static void main(String[] args) {
        /*
        Finding the maximum number in 3 numbers
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no1 :");
        int no1 = sc.nextInt();
        System.out.println("Enter no2 :");
        int no2 = sc.nextInt();
        System.out.println("Enter no3 :");
        int no3 = sc.nextInt();

        if((no1 > no2) && (no1 > no3) )
            System.out.println(no1 + " is bigger");
        else if (no2 > no3)
            System.out.println(no2 + " is bigger");
        else
            System.out.println(no3 + " is bigger");
    }
}