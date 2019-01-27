import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      
      int num = in.nextInt();
      
      for(int i = 2; i <= num; i++){
      	if(is_prime(i)){
        	System.out.println(i);
        }
      } 
    }
  
  public static boolean is_prime(int m)
  {
  	for(int i = 2; i <= m/2; i++){
    	if(m % i == 0){
        	return false;
        }
      }
      return true;

  }
}