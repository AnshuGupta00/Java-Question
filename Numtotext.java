    import java.util.Scanner;
    public class Numtotext {
            public static void main(String[] args) {
                Scanner sc =new Scanner(System.in);
                System.out.print("Enter no: ");
                String num =sc.next();
            String[] words={
                "Zero","One","Two","Three","Four",
                "Five","Six","Seven","Eight","Nine"
            };
                
            for(int i=0; i<num.length(); i++ ){
                char ch = num.charAt(i);

            if (ch == '.') {
                    System.out.print("Point ");
                } else if (Character.isDigit(ch)) {
                    int digit = ch - '0';
                    System.out.print(words[digit] + " ");
                } else {
                    System.out.print("Invalid ");
                }
            }
        }
    }
    //q2  2nd and 3rd largest value from using an array//
    