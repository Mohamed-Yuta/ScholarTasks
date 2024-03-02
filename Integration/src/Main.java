public class Main {

    public static void main(String[] args) {
        double a = 0;
        double b = Math.PI / 2;
        int n = 10000000;
        double result = Integration.integration( a, b, n);
        System.out.println("Approximated integral of cos(x) from " + a + " to " + b + ": " + result);

    }
}