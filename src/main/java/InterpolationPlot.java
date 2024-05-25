import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.JFrame;

public class InterpolationPlot {

    public static void plotInterpolation(double[] x, double[] y, String title) {
        XYSeries series = new XYSeries("Interpolasi");

        for (double xi = 5; xi <= 40; xi += 0.5) {
            double yi = LagrangeInterpolation.interpolate(x, y, xi); // Bisa ganti ke NewtonInterpolation
            series.add(xi, yi);
        }

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        JFreeChart chart = ChartFactory.createXYLineChart(
                title,
                "Tegangan (kg/mm²)",
                "Waktu patah (jam)",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        ChartPanel chartPanel = new ChartPanel(chart);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        double[] x = {5, 10, 15, 20, 25, 30, 35, 40};
        double[] y = {40, 30, 25, 40, 18, 20, 22, 15};

        plotInterpolation(x, y, "Interpolasi Lagrange");
    }
}
