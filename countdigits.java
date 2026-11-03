import java.util.Scanner;
public class countdigits {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the digits ");
        int digits =sc.nextInt();
        int res =count(digits);
        System.out.println("Total digits are : " + res);
        }
        public static int count (int digits){
        if (digits == 0) {
                return 0;
            }
            return 1+count(digits/10);    
        }

}

