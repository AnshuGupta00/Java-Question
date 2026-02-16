import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the no of matrix: ");
        int n = sc.nextInt();

        int[][] matrix=new int[n][n];

        System.out.println("Enter matrix elements:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int flag=0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                // matrix[i][j] = sc.nextInt();
                if(i !=j && matrix[i][j] ==0){
                    flag=1;
                    break;
                }else if(matrix[i][j]!=0){
                }
            }
        } 
        if (flag == 0) {
                System.out.println("Its Diagonal");
        }else{
            System.out.println("It not a diagonal");
        }
        

    }
}
