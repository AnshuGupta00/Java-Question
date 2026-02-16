import java.util.Scanner;
public class Fabbionachi {
  public static void main(String[] args) {
    
  
    int n,total=0,first=0,second=1,next;    
    Scanner scn= new Scanner(System.in);

        System.out.print("Enter no : ");
        n=scn.nextInt();
        
        for(int i=1; i<=n; i++){
          System.out.print(first + " ");
            total+=first;

          next=first+   second;
          first=second;
          second=next;
        }
        System.out.println("\nSum of Fibonacci series: " + total);
    }
  }