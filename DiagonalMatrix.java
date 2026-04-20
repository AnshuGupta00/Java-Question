import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int flag = 0;

        outer:                                      // label for break
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && matrix[i][j] != 0) { // ✅ fixed condition
                    flag = 1;
                    break outer;                    // ✅ exits both loops
                }
            }
        }

        if (flag == 0) {
            System.out.println("It is a Diagonal Matrix");
        } else {
            System.out.println("It is NOT a Diagonal Matrix");
        }

        sc.close();
    }
}