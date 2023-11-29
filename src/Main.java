import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:\n1. Expression Calculator\n2. Average Array\n3. Matrix Processor\n4. Filter Words");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                ExpressionCalculator.main(args);
                break;
            case 2:
                performAverageArray();
                break;
            case 3:
                performMatrixProcessor(scanner);
                break;
            case 4:
                FilterWords.main(args);
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    private static void performAverageArray() {
        double[] inputArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        AverageArray arrayBuilder = new AverageArray(inputArray);

        arrayBuilder.buildArrayB();

        double[] resultArray = arrayBuilder.getArrayB();

        System.out.print("Array B: ");
        for (double num : resultArray) {
            System.out.print(num + " ");
        }
    }

    private static void performMatrixProcessor(Scanner scanner) {
        System.out.print("Enter the size of the matrix: ");
        int size = scanner.nextInt();

        MatrixProcessor matrixProcessor = new MatrixProcessor(size);

        matrixProcessor.inputMatrixValues(scanner);
        matrixProcessor.printMatrix();
        matrixProcessor.processMatrix();
    }
}
