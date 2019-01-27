import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      
      Scanner in = new Scanner(System.in);
      
      int num, first;
      
      num = in.nextInt();
      
      first = num / 100;
      
      System.out.println(first);
	}
}