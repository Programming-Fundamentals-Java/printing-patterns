import java.util.Scanner;

public class CalculateIncrementedSalaryIfElse {
    public static void main(String[] args) {
        /*
        Employee Salary
        Employee Department
        Employee Experience

        Department       Experience       Increment
        -------------------------------------------
        Development(D)     5-10               7
        Testing(T)         5-10               6
        Development(D)     1-5                15
        Testing(T)         1-5                12
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Department");
        char department = sc.next().charAt(0);
        System.out.println("Enter Employee Experience");
        byte experience = sc.nextByte();
        System.out.println("Enter Employee Salary");
        float salary = sc.nextFloat();
        byte incrementPercentage;

        if( (department == 'D') && (experience >=5 && experience <=10))
            incrementPercentage = 7;
        else if( (department == 'D') && (experience >=1 && experience <=5))
            incrementPercentage = 15;
        else if( (department == 'T') && (experience >= 5 && experience <=10))
            incrementPercentage = 6;
        else if( (department == 'T') && (experience >= 1 && experience <=5))
            incrementPercentage = 12;
        else
            incrementPercentage = 3;

        float totalSalary;
        totalSalary = salary + (salary * incrementPercentage / 100);

        System.out.println("Total Salary after the increment :" + totalSalary);
    }
}
