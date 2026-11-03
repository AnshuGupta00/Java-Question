import java.util.Scanner;
public class power {

    public static void main (String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the base of no :");
    int base= sc.nextInt();
    System.out.print("Enter the power of no :");
    int exponent = sc.nextInt();
    int res=pow(base, exponent);
    System.out.print("The calculation of power is :" + res);
    sc.close();
    }

    public static int pow(int base, int exponent){
        if(exponent == 0){
            return 1;
        }
        return base * pow(base,exponent-1);
    }
}
