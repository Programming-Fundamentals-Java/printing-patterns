public class ExplicitTypeConversion {
    public static void main(String[] args) {
        //1. Real to Integer
        //float -> byte, short, int, long
        //double -> byte, short, int, long

        float price;
        price = 100.23f;

        byte priceByte;
        priceByte = (byte) price;

        System.out.println(priceByte);

        price = 130.23f;

        priceByte = (byte) price;

        System.out.println(priceByte);

        //2. High Memory data to lower memory

        int age;
        age = 130;

        byte ageByte;
        ageByte = 100;

        ageByte = (byte) age;
        System.out.println(ageByte);
    }
}
