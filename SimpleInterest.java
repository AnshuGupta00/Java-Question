    import java.util.Scanner;

    public class SimpleInterest {

        public static void main(String[] args) {

            int principal;  
            float rate, interest, total;

            Scanner scn = new Scanner(System.in);

            System.out.print("Enter Principal: ");
            principal = scn.nextInt();

            System.out.print("Enter Rate: ");
            rate = scn.nextFloat();

            System.out.print("Enter Time: ");
            interest = scn.nextFloat();

            total = (principal * rate * interest) / 100;

            System.out.println("Simple Interest calculated: " + total);
        }
    }
