public class CompoundAssignmentOperator {
    public static void main(String[] args) {
        //Compound Assignment Operator
        // += , -= , *= , /= , %=

        short salary;
        salary = 10000;
        // salary = (short) (salary + 1000);
        salary += 1000; //salary = salary + 1000;
        System.out.println("Updated Salary:" + salary);

        // salary = (short) (salary * 2 + 100);
        // System.out.println("Updated Salary 1: " + salary);

        salary = 10 + 100; //(11000 * 110)
        System.out.println("Updated Salary 1: " + salary);

        byte b = 10;
        b -= 10;
        System.out.println(b);

        b = 10;
        b *= 5;
        System.out.println(b);

        b = 10;
        b /= 5;
        System.out.println(b);

        b = 10;
        b %= 5;
        System.out.println(b);
    }
}
