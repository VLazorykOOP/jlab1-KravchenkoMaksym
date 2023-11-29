import java.util.Scanner;

class MatrixProcessor {
    private int[][] matrix;
    private int size;

    public MatrixProcessor(int size) {
        this.size = size;
        this.matrix = new int[size][size];
    }

    public void inputMatrixValues(Scanner scanner) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Enter element A[%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public void printMatrix() {
        System.out.println("Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void processMatrix() {
        int sumAboveDiagonal = 0;
        int sumOnDiagonal = 0;
        boolean elementsAboveAreGreaterThanBelow = true; // Початкове припущення

        System.out.print("Sum of elements on the main diagonal: ");
        for (int i = 0; i < size; i++) {
            System.out.printf("A[%d][%d]: %d ", i, i, matrix[i][i]);
            sumOnDiagonal += matrix[i][i];
        }
        System.out.println("\nTotal: " + sumOnDiagonal);

        System.out.print("Sum of elements above the main diagonal: ");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                System.out.printf("A[%d][%d]: %d ", i, j, matrix[i][j]);
                sumAboveDiagonal += matrix[i][j];
            }
        }
        System.out.println("\nTotal: " + sumAboveDiagonal);

        System.out.println("Comparisons:");

        for (int i = 1; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if (sumOnDiagonal < matrix[i][j]) {
                    System.out.printf("A[%d][%d]: %d > Sum on Diagonal: %d%n", i, j, matrix[i][j], sumOnDiagonal);
                    elementsAboveAreGreaterThanBelow = false; // Якщо знайдено елемент, який менший за елемент нижче головної діагоналі
                }
                if (sumAboveDiagonal < matrix[i][j]) {
                    System.out.printf("A[%d][%d]: %d > Sum above Diagonal: %d%n", i, j, matrix[i][j], sumAboveDiagonal);
                    elementsAboveAreGreaterThanBelow = false; // Аналогічно для елементів вище головної діагоналі
                }
            }
        }

        // Перевірка та виведення повідомлення
        if (elementsAboveAreGreaterThanBelow) {
            System.out.println("No elements above the diagonal are greater than all elements below the diagonal.");
        }
    }
}
