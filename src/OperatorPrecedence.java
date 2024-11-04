public class OperatorPrecedence {
    public static void main(String[] args) {
        //Operator Precedence
        //* / % higher precedence
        //+ -

        int a,b,c,d,e,f;

        a = 10;
        b = 20;
        c = 30;
        d = 40;
        e = 50;
        f = 60;

        int res;
        res = a + b - c * d / e % f;

        System.out.println(res);

        res = a + (b - c) * d / e % f;

        System.out.println(res);
    }
}
