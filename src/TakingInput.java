import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        //Take Input
        // BufferedReader
        // Scanner

        Scanner sc = new Scanner(System.in);
        byte age;
        System.out.println("Enter age:");
        age = sc.nextByte();
        System.out.println("Age is :" + age);

        System.out.println("Enter Marks:");
        short marks = sc.nextShort();
        System.out.println("Marks: " + marks);

        System.out.println("Enter Salary: ");
        int salary = sc.nextInt();
        System.out.println("Salary is: " + salary);

        System.out.println("Enter Annual Revenue: ");
        long annualRevenue = sc.nextLong();
        System.out.println("Annual Revenue: " + annualRevenue);

        System.out.println("Enter Product Price:");
        float productPrice = sc.nextFloat();
        System.out.println("Product Price: " + productPrice);

        System.out.println("Average Annual Revenue :");
        double aveAnnualRevenue = sc.nextDouble();
        System.out.println("Average Annual Revenue : " + aveAnnualRevenue);

        System.out.println("Enter Gender");
        char gender = sc.next().charAt(0);
        System.out.println("Gender : " + gender);

        System.out.println("Is Available");
        boolean available = sc.nextBoolean();
        System.out.println("Is Available : " + available);
    }
}
