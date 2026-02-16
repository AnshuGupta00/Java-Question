import java.util.Scanner;

public class AdditionMatrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the no of matrix: ");
        int n = sc.nextInt();

        int[][] a=new int[n][n];
        int[][] b=new int[n][n];
        int[][] sum=new int[n][n];
        int[][] sub=new int[n][n];
        int[][] mul=new int[n][n];
        int[][] div=new int[n][n];

        System.out.println("Enter First matrix elements:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Second matrix elements:");

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of Matrix:");

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

          // For subtracting
          System.out.println("SUb of Matrix:");

          for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                sub[i][j] = a[i][j] - b[i][j];
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(sub[i][j]+" ");
            }
            System.out.println();
        }

          System.out.println("MUL of Matrix:");

          for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                mul[i][j] = a[i][j] * b[i][j];
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }

              System.out.println("DIV of Matrix:");

          for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                div[i][j] = a[i][j] / b[i][j];
            }
          }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(div[i][j]+" ");
            }
            System.out.println();
        }
    }
}
