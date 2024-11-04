import java.util.Scanner;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        //Print Prime Numbers from 1 to N

        Scanner sc = new Scanner(System.in);
        int maxLimit = sc.nextInt();

        int number = 2;
        while (number <= maxLimit) {

            //code to check the number is a prime or not
            int no = 2;
            while (no < number) {
                if (number % no == 0)
                    break;
                no++;
            }
            if (no == number)
                System.out.println(number + ",");
            number++;
        }
    }
}