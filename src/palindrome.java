public class palindrome {
    public static boolean pal(int x)
    {
        if (x < 0) {
            return false;
        }

        long reversed = 0;
        long temp = x;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }

    public static void main(String[] args) {
        int[] arr={121,201,222};
        for(int x:arr)
        {
            System.out.println(pal(x));
        }
    }
}
