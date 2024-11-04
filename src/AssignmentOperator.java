public class AssignmentOperator {
    public static void main(String[] args) {
        //assignment operator (=)
        float price;
        price = 435234.23F;
        //assignment operator will be evaluated from right to left

        Long priceLong;
        priceLong = (long) price;

        System.out.println(priceLong);
    }
}
