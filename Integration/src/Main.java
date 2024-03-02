public class Main {

    public static void main(String[] args) {
        double a = 0;
        double b = Math.PI / 2;
        int n = 10000000;
        double result = Integration.integration( a, b, n);
        System.out.println("Approximated integral of cos(x) from " + a + " to " + b + ": " + result);
        //Testing
        double target = 0.5; // Target value to match to 5 decimal places
        int intervals = 1; // Start with 1 interval
        double error = Math.abs(result - target);
        while (error >= 0.00001) { // Until error is less than 0.00001
            intervals *= 2; // Double the number of intervals
            result = Integration.integration(a,b,intervals);
            error = Math.abs(result - target);
        }
        System.out.println("Number of intervals for accuracy to the fifth decimal place: " + intervals);

    }
}