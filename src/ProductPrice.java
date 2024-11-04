import java.util.Scanner;

public class ProductPrice {
    public static void main(String[] args) {
        //Product Price after discount

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Price");
        float price;
        price = sc.nextFloat();

        System.out.println("Enter Discount Percentage");
        float discountPercentage;
        discountPercentage = sc.nextFloat();

        /*
        float finalPrice = price ((price discountPercentage) / 188);
        System.out.println("Final Price: finalPrice);
        */

        float discount = price * discountPercentage / 100;
        System.out.println("Discount : " + discount);

        float finalPrice = price - discount;
        System.out.println("Final Price : " + finalPrice);
    }
}
