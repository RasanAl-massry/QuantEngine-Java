import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("    Welcome to Quant Engine CLI     ");
        System.out.println("====================================\n");

        // 1. تجربة التغير المئوي تفاعلياً (QuantitativeMath)
        System.out.println("--- 1. Quantitative Math Module ---");
        System.out.print("Enter Initial Value: ");
        double initialVal = scanner.nextDouble();

        System.out.print("Enter Final Value: ");
        double finalVal = scanner.nextDouble();

        double rateOfChange = QuantitativeMath.calculateRateOfChange(initialVal, finalVal);
        System.out.printf("Rate of Change: %.2f%%\n\n", rateOfChange * 100);

        // 2. تجربة متوسط العوائد تفاعلياً (RiskAnalytics)
        System.out.println("--- 2. Risk Analytics Module ---");
        System.out.print("How many daily returns do you want to calculate? ");
        int count = scanner.nextInt();

        double[] returns = new double[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter return " + (i + 1) + " (e.g., 0.02 for 2%): ");
            returns[i] = scanner.nextDouble();
        }

        double avgReturn = RiskAnalytics.calculateMean(returns);
        System.out.printf("Average Daily Return: %.2f%%\n\n", avgReturn * 100);

        System.out.println("====================================");
        System.out.println("     Calculation Complete!          ");
        System.out.println("====================================");

        scanner.close();
    }
}
