import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      
      Scanner in = new Scanner(System.in);
      
      int n, sum = 0;
      int rem=0;
      
      n = in.nextInt();
     
     while(n != 0){
      rem = n% 10;
       sum = sum + rem;
       n = n/10;
     }
      System.out.println(sum);
      
	}
}