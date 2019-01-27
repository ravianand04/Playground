import java.util.Scanner;
class Main{
  public static int sod(int m){
    int sum = 0;
  	while(m != 0){
      	sum += m;
      	m--;
    }
    return sum;
  }
  
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      
      int m = in.nextInt();
      
      int result = sod(m);
      System.out.println(result);
      
	}
}