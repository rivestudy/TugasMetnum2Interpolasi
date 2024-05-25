public class LagrangeInterpolation {

    public static double interpolate(double[] x, double[] y, double xi) {
        int n = x.length;
        double result = 0;

        for (int i = 0; i < n; i++) {
            double term = y[i];
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    term = term * (xi - x[j]) / (x[i] - x[j]);
                }
            }
            result += term;
        }

        return result;
    }

    public static void main(String[] args) {
        double[] x = {5, 10, 15, 20, 25, 30, 35, 40};
        double[] y = {40, 30, 25, 40, 18, 20, 22, 15};

        double xi = 20;
        double yi = interpolate(x, y, xi);
        System.out.println("Interpolasi Lagrange di x = " + xi + " adalah y = " + yi);
    }
}
