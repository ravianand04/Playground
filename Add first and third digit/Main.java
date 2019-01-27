import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
     
      Scanner in = new Scanner(System.in);
      
      int n1, a1, a2, sum;
      
      n1 = in.nextInt();
      
      a1 = n1 / 100;
      a2 = n1 % 10;
      
      sum = a1 + a2;
      
      System.out.println(sum);
      
	}
}