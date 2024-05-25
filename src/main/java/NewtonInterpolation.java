import java.util.Arrays;

public class NewtonInterpolation {

    public static double[] dividedDiff(double[] x, double[] y) {
        int n = x.length;
        double[] coef = Arrays.copyOf(y, n);

        for (int j = 1; j < n; j++) {
            for (int i = n - 1; i >= j; i--) {
                coef[i] = (coef[i] - coef[i - j]) / (x[i] - x[i - j]);
            }
        }

        return coef;
    }

    public static double interpolate(double[] x, double[] coef, double xi) {
        int n = x.length;
        double result = coef[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            result = result * (xi - x[i]) + coef[i];
        }

        return result;
    }

    public static void main(String[] args) {
        double[] x = {5, 10, 15, 20, 25, 30, 35, 40};
        double[] y = {40, 30, 25, 40, 18, 20, 22, 15};

        double[] coef = dividedDiff(x, y);
        double xi = 20;
        double yi = interpolate(x, coef, xi);
        System.out.println("Interpolasi Newton di x = " + xi + " adalah y = " + yi);
    }
}
