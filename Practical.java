import java.util.Scanner;

public class Practical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the order of matrix (n): ");
        int n = sc.nextInt();
        
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        double[][] div = new double[n][n];  

        System.out.println("Enter First Matrix Elements:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Second Matrix Elements:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Division of Matrices:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {

                if(b[i][j] != 0) {
                    div[i][j] = (double) a[i][j] / b[i][j];
                } else {
                    System.out.println("Division by zero at position [" + i + "][" + j + "]");
                    div[i][j] = 0;  
                }
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(div[i][j] + " ");
            }
            System.out.println();  
        }
        sc.close();
    }
}