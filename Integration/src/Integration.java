public class Integration {
    public static double rectangularIntegration( double a, double b, int n) {
        double sum = 0;
        double dx = (b - a) / n; // Width of each interval
        for (int i = 0; i < n; i++) {
            double x = a + i * dx; // Left endpoint of the interval
            sum += Cosinus.cos(x) * dx; // Area of the rectangle
        }
        return sum;
    }
}
