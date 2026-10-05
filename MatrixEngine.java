public class MatrixEngine {
    // دالة الضرب النقطي لحساب عائد المحفظة (Weighted Portfolio Return)
    public static double calculatePortfolioReturn(double[] weights, double[] returns) {
        double totalReturn = 0.0;
        for (int i = 0; i < weights.length; i++) {
            totalReturn += weights[i] * returns[i];
        }
        return totalReturn;
    }
}

