public class RulesSwitchStatement {
    public static void main(String[] args) {
        /*
        Rule 1: the choice must be evaluated to either int, char, String or Enum Type only
         */

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Day 1");
        }

        /*
        Rule 2: Duplicated cases are not allowed
         */

        switch (day) {
            case 1:
                System.out.println("Day 1");
            case 2:
                System.out.println("Day 2");
            /*
            case 1:
                System.out.println("Day one"); */
        }

        /*
        Rule 3: You can use different data types (Int, char, String, enum) with in case labels
         */

        switch (day) {
            case 1:
                System.out.println("Day 1");
            case 2:
                System.out.println("Day 2");
        }

        /*
        Rule 4: default is optional and can be written anywhere in switch
         */

        day = 3;
        switch (day) {
            default:
                System.out.println("Invalid Day");
            case 1:
                System.out.println("Day 1");
            case 2:
                System.out.println("Day 2");
        }
    }
}

