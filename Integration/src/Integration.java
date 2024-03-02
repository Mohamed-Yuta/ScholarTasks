public class Integration {
    public static double integration( double a, double b, int n) {
        double sum = 0;
        double dx = (b - a) / n;
        for (int i = 0; i < n; i++) {
            double x = a + i * dx;
            sum += Cosinus.cos(x) * dx;
        }
        return sum;
    }
}
