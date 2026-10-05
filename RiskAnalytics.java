public class RiskAnalytics {   public static double calculateMean(double[] returns) {
    double sum = 0.0;
    for (double r : returns) {
        sum += r;
    }
    return sum / returns.length;
}
}
