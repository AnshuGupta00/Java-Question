import java.util.Scanner;

public class Menudriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        char ch;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");    
            
           int choice = sc.nextInt();
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                int a = sc.nextInt();
                System.out.print("Enter second number: ");
                int b = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Result = " + (a + b));
                        break;
                    case 2:
                        System.out.println("Result = " + (a - b));
                        break;
                    case 3:
                        System.out.println("Result = " + (a * b));
                        break;
                    case 4:
                        if (b != 0) {
                            System.out.println("Result = " + (a / b));
                        } else {
                            System.out.println("Cannot divide by zero");
                        }
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Program exited.");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
            System.out.print("Do you want to continue (Y/N): ");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
        sc.close();
    }
}
