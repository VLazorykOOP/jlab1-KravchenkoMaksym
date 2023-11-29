public class AverageArray {
    private double[] A;
    private double[] B;

    public AverageArray(double[] inputArray) {
        A = inputArray;
        B = new double[A.length];
    }

    public void buildArrayB() {
        for (int i = 0; i < A.length; i++) {
            B[i] = calculateAverageWithoutAi(i);
        }
    }

    private double calculateAverageWithoutAi(int index) {
        double sum = 0;
        for (int j = 0; j < A.length; j++) {
            if (j != index) {
                sum += A[j];
            }
        }
        return sum / (A.length - 1);
    }

    public double[] getArrayB() {
        return B;
    }

    public static void main(String[] args) {
        double[] inputArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        AverageArray arrayBuilder = new AverageArray(inputArray);

        arrayBuilder.buildArrayB();

        double[] resultArray = arrayBuilder.getArrayB();

        System.out.print("Array B: ");
        for (double num : resultArray) {
            System.out.print(num + " ");
        }
    }
}
