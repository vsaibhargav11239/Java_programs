import java.util.Scanner;

class MatrixAddMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;

        System.out.print("Enter number of rows: ");
        r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        c = sc.nextInt();

        int[][] A = new int[r][c];
        int[][] B = new int[r][c];
        int[][] sum = new int[r][c];
        int[][] mul = new int[r][c];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                B[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                sum[i][j] = A[i][j] + B[i][j];

        System.out.println("Matrix Addition:");
        for (int[] row : sum) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }

        if (r == c) {
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    for (int k = 0; k < c; k++)
                        mul[i][j] += A[i][k] * B[k][j];

            System.out.println("Matrix Multiplication:");
            for (int[] row : mul) {
                for (int val : row)
                    System.out.print(val + " ");
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication not possible (non-square).");
        }
        sc.close();
    }
}