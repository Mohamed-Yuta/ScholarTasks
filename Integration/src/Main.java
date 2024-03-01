public class Main {

    public static void main(String[] args) {
        double a = 0; // Lower limit of integration
        double b = Math.PI / 2; // Upper limit of integration
        int n = 1000000; // Number of intervals
        double result = Integration.rectangularIntegration( a, b, n);
        System.out.println("Approximated integral of cos(x) from " + a + " to " + b + ": " + result);

    }
}