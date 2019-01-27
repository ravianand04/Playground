import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      
      Scanner in = new Scanner(System.in);
      
      int num = in.nextInt();
      
      int a1 = num % 10;
      int a2 = num / 10;
      
      int sum = a1 + a2;
      System.out.println(sum);
	}
}