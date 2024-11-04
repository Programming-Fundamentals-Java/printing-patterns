import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        /*
        --------------------------------------------
        Welcome to E-commerce App
        --------------------------------------------

        Select Category:
        1. Men
        2. Women
        3. Kids

        Enter Choice :

         */

        System.out.println("-----------------------------------------------------");
        System.out.println("Welcome to E-Commerce App");
        System.out.println("-----------------------------------------------------");
        System.out.println("\n");
        System.out.println("Select Category :");
        System.out.println("1. Men");
        System.out.println("2. Women");
        System.out.println("3. Kids \n");

        System.out.println("Enter Choice : ");
        Scanner sc = new Scanner(System.in);

        byte inputChoice = sc.nextByte();

        switch (inputChoice) {
            case 1:
                System.out.println("Welcome to Men Section");
                System.out.println("----------------------");
                System.out.println("Select Category :");
                System.out.println(" 1. T-Shirts");
                System.out.println(" 2. Shirts");
                System.out.println(" 3. Party Wear");

                System.out.println("Enter Choice: ");
                byte menInputChoice = sc.nextByte();
                switch (menInputChoice){
                    case 1:
                        System.out.println("Men T-Shirts Category");
                        break;
                    case 2:
                        System.out.println("Men Shirts Category");
                        break;
                    case 3:
                        System.out.println("Men Party-wear Category");
                        break;
                    default:
                        System.out.println("Invalid Input, Please try again!");
                }
                break;
            case 2:
                System.out.println("Welcome to Women Section");
                System.out.println("----------------------");
                System.out.println("Select Category :");
                System.out.println(" 1. T-Shirts");
                System.out.println(" 2. Shirts");
                System.out.println(" 3. Party Wear");

                System.out.println("Enter Choice: ");
                byte womenInputChoice = sc.nextByte();
                switch (womenInputChoice){
                    case 1:
                        System.out.println("Women T-Shirts Category");
                        break;
                    case 2:
                        System.out.println("Women Shirts Category");
                        break;
                    case 3:
                        System.out.println("Women Party-wear Category");
                        break;
                    default:
                        System.out.println("Invalid Input, Please try again!");
                }
                break;
            case 3:
                System.out.println("Welcome to Kids Section");
                System.out.println("----------------------");
                System.out.println("Select Category :");
                System.out.println(" 1. T-Shirts");
                System.out.println(" 2. Shirts");
                System.out.println(" 3. Party Wear");

                System.out.println("Enter Choice: ");
                byte kidsInputChoice = sc.nextByte();
                switch (kidsInputChoice){
                    case 1:
                        System.out.println("Kids T-Shirts Category");
                        break;
                    case 2:
                        System.out.println("Kids Shirts Category");
                        break;
                    case 3:
                        System.out.println("Kids Party-wear Category");
                        break;
                    default:
                        System.out.println("Invalid Input, Please try again!");
                }
                break;

            default:
                System.out.println("Invalid input, Please try again !");
        }
    }
}
