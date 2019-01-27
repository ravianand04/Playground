import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      
      Scanner in = new Scanner(System.in);
      
      int base = in.nextInt();
      int exp = in.nextInt();
      
      int power = find_power(base, exp);
      System.out.println(power);
	}
  
  public static int find_power(int base, int exp){
  	int power = 1;
    
    while(exp >=  1){
    	power = power * base;
      	exp--;
    }
    return power;
  }
}