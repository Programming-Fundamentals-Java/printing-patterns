public class ImplicitTypeConversion {
    public static void main(String[] args) {
        //Implicit Type COnveersion

        //1. Integer to Real
        /*
        byte - float
        short - float
        int  - float
        long - float

        byte - double
        short - double
        int - double
        long - double
         */

        byte age;
        age = 100;

        float ageFloat;
        ageFloat = (float) age; //(float) = (byte)

        System.out.println(ageFloat);

        //2.Based on Memory
        //Low memory data to high memory data
        int ageInt;

        ageInt = age;

        System.out.println(ageInt);

        float price;
        price = 21432.0F;

        double priceDouble;
        priceDouble = price;

        System.out.println(priceDouble);
    }
}
