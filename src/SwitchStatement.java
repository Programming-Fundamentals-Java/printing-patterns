public class SwitchStatement {
    public static void main(String[] args) {
        /*
        Syntax:
        switch(choice){
            case label1:
                    code;
            case label2:
                    code;
            case label3:
                    code;
            default:
                    code;
        }
        //choice must be evaluated int, char, String, Enum Type
         */

        byte day;
        day = 1;

        switch(day) {
            case 1:
                System.out.println("Print Monday Schedule");
                break;
            case 2:
                System.out.println("Print Tuesday Schedule");
                break;
            case 3:
                System.out.println("Print Wednesday Schedule");
                break;
            case 4:
                System.out.println("Print Thursday Schedule");
                break;
            case 5:
                System.out.println("Print Friday Schedule");
                break;
            case 6:
                System.out.println("Print Saturday Schedule");
                break;
            case 7:
                System.out.println("Print Sunday Schedule");
                break;
            default:
                System.out.println("Invalid Day Input");
        }
    }
}