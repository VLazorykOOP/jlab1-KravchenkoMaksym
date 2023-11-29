import java.util.Scanner;

public class ExpressionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть значення n:");
        double n = scanner.nextDouble();

        System.out.println("Введіть значення m:");
        double m = scanner.nextDouble();

        // Варіант 1: вхідні дані дійсного типу, результат – дійсного
        double result1 = calculateExpression(n, m);
        System.out.println("Результат (дійсний тип): " + result1);

        // Варіант 2: вхідні дані цілого типу, результат – дійсного
        int nInt = (int) n;
        int mInt = (int) m;
        double result2 = calculateExpression(nInt, mInt);
        System.out.println("Результат (дійсний тип з цілими вхідними): " + result2);

        // Варіант 3: вхідні дані дійсного типу, результат – цілого
        int result3 = (int) calculateExpression(n, m);
        System.out.println("Результат (цілий тип): " + result3);
    }

    private static double calculateExpression(double n, double m) {
        return ((n + m - 4) + n * m - Math.pow(n, 4) + Math.pow(m, 3)) / Math.pow((m + 2), 2);
    }

    private static double calculateExpression(int n, int m) {
        return ((n + m - 4) + n * m - Math.pow(n, 4) + Math.pow(m, 3)) / Math.pow((m + 2), 2);
    }
}
