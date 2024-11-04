public class LogicalOperators {
    public static void main(String[] args) {
        // Logical Operators
        // Logical Operators are used to combine more than one condition / constraint / expression
        // (a>b)
        // Logical AND
        // exp1 && exp2 && exp3 6& exp4
        //Rule: if any one of the expression is false then the entire resultant is false
        /*
        TT -> T
        TF -> F
        FT -> F
        FF -> F
        */

        byte distance;
        distance = 100;

        byte time;
        time = 5;

        System.out.println((distance > 500) && (time > 2));
        //Logical OR(13
        // Rule: if any one of the expression is true then the entire resultant is true
        /*
        TT -> T
        TF -> T
        FT -> T
        FF -> F
        */

        System.out.println((distance > 500) || (time > 2));

        // Logical exOR ( ^ )
        // exp1 ^ exp2 ^ ex3 ..
        // Rule : if both the expressions are evaluated to the  same output then the resultant is false
        /*
        TT -> F
        FT -> T
        TF -> T
        FF -> F
         */

        System.out.println((distance > 500) ^ (time > 2));

        // short circuit logical operators
        byte no1,no2;
        no1 = 10;
        no2 = 20;

        System.out.println((++no1 > 20) && (no2-- < 25));
        System.out.println(no1);
        System.out.println(no2);

        no1 = 10;
        no2 = 20;

        System.out.println((++no1 > 10) | (no2-- < 15));
        System.out.println(no1);
        System.out.println(no2);
    }
}
