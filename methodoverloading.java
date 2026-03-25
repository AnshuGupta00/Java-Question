import java.util.Scanner;

public class methodoverloading {
        Scanner sc=new Scanner(System.in);
    int add(int a,int b){
            return a+b;
    }
    double add(double a,double b){
            return a+b;
    }
    int add(int a, int b,int e){
        return a+b+e;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        methodoverloading obj =new methodoverloading();
        
        System.out.println("Enter the no:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("The sum of integer:"+ obj.add(x,y));

        System.out.println("Enter the float no:");
        float c=sc.nextFloat();
        float d=sc.nextFloat();
        System.out.println("The sum of integer:"+ obj.add(c,d));

         System.out.println("Enter the integer no:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int e=sc.nextInt();
        System.out.println("The sum of integer:"+ obj.add(a,b,e));
        sc.close();
    }
}
