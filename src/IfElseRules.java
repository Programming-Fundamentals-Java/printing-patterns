public class IfElseRules {
    public static void main(String[] args) {
        /*
        Rules
        1. The condition must be evaluated to only boolean
        */
        int no = 50235;
        // if the no is divisible by 2, then it is even number else it is odd number
        if (no % 2 == 0) {
            System.out.println(no + " is even number");
        } else {
            System.out.println(no + " is odd number");
        }

        boolean isOverSpeed;
        isOverSpeed = false;

        short speed;
        speed = 120;

        if (isOverSpeed) {
            speed -= 30;
        } else {
            speed += 30;
        }
        System.out.println("Updated Speed : " + speed);

        /*
        Rule 2: it can be written without else but else can't be written without if
         */

        byte age = 15;
        if (age >= 18) {
            System.out.println("You are allowed to cast vote");
        }
        // System.out.println("Casting Vote Result : ");
        else {
            System.out.println("You are not allowed to cast vote");
        }

        /*
        Rule 3: if only one statement is dependent on either if or else, no need to write { }
         */

        byte castingVoteAge;
        castingVoteAge = 25;
        if (castingVoteAge >= 18)
            System.out.println("You are allowed to cast vote");
        else
            System.out.println("Yου are not allowed to cast vote");
        /*
        Rule 4: nested if-else (if-else ladder) can be simplified
         */

        float averageMarks;
        averageMarks = 77.5f;
        char grade;
        // Calculate Grade of a student based on grade
        // if the average Marks > 70 grade A
        // else if the average marks in between 60 and 70 grade B
        // else if the average marks in between 50 and 50 grade C
        // else failed (F)

        if (averageMarks > 70)
            grade = 'A';
        else if (averageMarks > 60 && averageMarks <= 70)
            grade = 'B';
        else if (averageMarks > 50 && averageMarks <= 60)
            grade = 'C';
        else
            grade = 'F';
    }
}
