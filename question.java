import java.util.Scanner;

public class question {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of times: ");
        int n = sc.nextInt();

        int a = 3;
        int b = 4;
        for(int i = 0; i <=n; i++) {
            int sum = a + b;
            System.out.println(a + " + " + b + " = " + sum);
            a += sum;
            b++;
        }

        sc.close();
    }
}
