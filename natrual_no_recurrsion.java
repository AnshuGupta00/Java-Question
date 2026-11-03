import java.util.Scanner;

public class natrual_no_recurrsion {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no :");
        int n=sc.nextInt();
        natural(n);
        sc.close();
    }
    
    public static void natural (int n){
        if(n ==0 ){
            return;
        }
            natural(n-1);
            System.out.println( "The natrual no is :"+ n );

    }
    
}

