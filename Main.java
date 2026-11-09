public class Dsa {

    public static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static void main(String[] args) {

        int a = 2;
        int b = 4;

        int gcd = gcd(a, b);

        int lcm = (a * b) / gcd;

        System.out.println("LCM = " + lcm);
    }
}