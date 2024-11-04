public class NestedLoops {
    public static void main(String[] args) {
        /*
        Week1
            Day1 Task
            Day2 Task
            Day3 Task
            Day4 Task
            Day5 Task
            Day6 Task
            Day7 Task

        Week2
            Day1 Task
            Day2 Task
            Day3 Task
            Day4 Task
            Day5 Task
            Day6 Task
            Day7 Task

        Week3
            Day1 Task
            Day2 Task
            Day3 Task
            Day4 Task
            Day5 Task
            Day6 Task
            Day7 Task

        Week4
            Day1 Task
            Day2 Task
            Day3 Task
            Day4 Task
            Day5 Task
            Day6 Task
            Day7 Task

         */

        /*
        byte week;
        week = 1;
        while(week <= 4) { //outer while loop
            System.out.println("Week "+ week);
            byte day = 1;
            while(day <= 7){ //inner while loop
                System.out.println("\tDay " + day + " Task ");
                day++;
            }
            week++;
        }

         */

        /*
        do while
         */
        /*

        byte week;
        week = 1;
        do { //outer do-while loop
            System.out.println("Week "+ week);
            byte day = 1;
            do{ //inner do-while loop
                System.out.println("\tDay " + day + " Task ");
                day++;
            } while(day <= 7);
            week++;
        } while (week <= 4);
        */

        //for loop

        for(int week = 1; week <= 4; week++) {
            System.out.println("Week " + week);
            for (int day = 1; day <= 7; day++) {
                System.out.println("\tDay " + day + " Task ");
            }
        }
    }
}
