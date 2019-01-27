import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      
      Scanner in =  new Scanner(System.in);
      int n, first, last, sum = 0;
      
      n = in.nextInt();
      
      last = n%10;
      
      while(n >= 10)
        n = n/10;
      
      first = n;
      
      sum = first + last;
      System.out.println(sum);
	}
}