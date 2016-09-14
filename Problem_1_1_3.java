import java.util.Scanner;

public class Problem_1_1_3 {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int a, b, c;
      
      a = console.nextInt();
      b = console.nextInt();
      c = console.nextInt();
      
      if ((a == b) && (b==c)) 
         System.out.println("equal");
      else 
         System.out.println("not equal");
   }
}