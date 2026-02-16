// Printing Rectangle Pattern in Java
class first {
    public static void main(String[] args) {
        // System.out.println("Hello, World! you ");
       for(int i=1; i<=4; i++){
           for(int j=1; j<=5; j++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}


//Hallow Rectangle Pattern in Java
class Pattern{
public static void main(String[] args){
  int i,j;
  
  for(i=1; i<=5; i++){
      for(j=1; j<=5; j++){
          if(i==1 || i==5 || j== 1 || j==5){
              System.out.print("*  ");
          }else{
              System.out.print("   ");
          }
      }
      System.out.println();
  }
}    
}

// Right angled tringle 
class pattern{
public static void main(String[] args){
  int i,j;
  for(i=1; i<=4; i++){
      for(j=1; j<=i; j++){  
        System.out.print("* ");
      }
      System.out.println(" ");
  }
}    
}

