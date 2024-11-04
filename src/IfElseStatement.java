import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        //if-else statement (conditional statement)
        /*
        syntax
        if(condition){
        //if block
        }
        else{
        // else block
        }
         */

        Scanner sc = new Scanner(System.in);
        int no1, no2;
        System.out.println("Enter no1 : ");
        no1 = sc.nextInt();
        System.out.println("Enter no2 : ");
        no2 = sc.nextInt();

        if (no1 > no2) {
            System.out.println(no1 + " is bigger");
        } else {
            System.out.println(no2 + " is bigger");
        }
    }
}