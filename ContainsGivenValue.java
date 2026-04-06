import java.util.Scanner;
public class ContainsGivenValue {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value for search:");
        int target=sc.nextInt();
        
        for(int i=0; i<n; i++){
            if(target == arr[i]){
                System.out.println("Value found at index: " + i);
                return; 
            }
            else{
                System.out.println("Value not found at index: " + i);
            }
        }
     }
}
