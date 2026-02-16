// import java.util.Scanner;
// public class Largest {
//     public static void main(String[] args) {

//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter no of element you want:");
//         int N=sc.nextInt();

//         int Max = 0;
//         for(int i=0; i< N; i++){
//             System.out.print("Enter the element you want:");

//             int num=sc.nextInt();
//             if(num>Max){
//                 Max=num;    
//             }
//         }
//         System.out.println("Largest number is: " + Max);
//         sc.close();
//     }
// }

// Now doing with the array.   
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element:");
        int N = sc.nextInt();
        int[] arr = new int[N];
        // System.out.print("Enter Arr Element:");
        for (int i = 0; i < N; i++) {
            System.out.print("Enter Arr Element:");
            arr[i] = sc.nextInt();
        }
        find_max(arr);
        find_tomax(arr);
        sc.close();
    }
    public static void find_max(int[] arr) {
        int Max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
        }
        System.out.println("First largest element is: " + Max);
    }    
    public static void find_tomax(int[] arr) {
        int Max = arr[0];
        int second_max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (Max < arr[i]) {
                Max = arr[i];
            } else if (arr[i] > second_max && arr[i] != Max) {
                second_max = arr[i];
            }
        }
        System.out.println("second largest element is: " + second_max);
    }
}