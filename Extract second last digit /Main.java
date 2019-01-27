import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      
      Scanner in = new Scanner(System.in);
      
      int num, sec;
      
      num = in.nextInt();
      int num1= num/10;
      
      sec = num1%10;
      System.out.println(sec);
	}
}