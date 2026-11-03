import java.util.Scanner;
public class sum_rec {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no ");
    int n =sc.nextInt();
    int res =0;
    res = additon(n);
    System.out.println("The sum is " + res);
    sc.close();
    }
    public static int additon(int n){
        if(n<=0){
            return 0; 
        }
            return n +additon(n-1);
    }
}
