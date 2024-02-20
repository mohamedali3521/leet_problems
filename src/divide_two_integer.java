public class divide_two_integer {
    public static int divide(int dividend, int divisor) {
        if(dividend==-2147483648 && divisor==-1)
        {
            return --dividend;
        }
        return dividend/divisor;
    }

    public static void main(String[] args) {
        int dividend=359;
        int divisor=12;
        System.out.println(divide(dividend,divisor));
    }
}
