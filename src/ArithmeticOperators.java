public class ArithmeticOperators {
    public static void main(String[] args) {
        //Arithmetic Operators

        /*
        + Additive Operator
        - Subtraction Operator
        * Multiplication Operator
        / division Operator
        % Modulus Operator
        */

        int no1, no2;
        no1 = 100;
        no2 = 200;

        int res;
        res =no1+no2;

        // (variable) = (operand) + (operand)

        System.out.println(res);

        res =no1-no2;
        System.out.println(res);

        res = no1 * no2;
        System.out.println(res);

        res = no1 / no2;
        System.out.println(res);

        // (integer) / (integer) -> int
        // (integer) / (real) -> double

        double res1;

        res1 = (double) no1 / no2;

        System.out.println(res1);

        res = no1 % no2;

        System.out.println(res);

        //Arithmetic Operators will be evaluated from left to right
    }
}
