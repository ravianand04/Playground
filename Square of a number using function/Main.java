import java.util.Scanner;
class Main
{
  	// Type your code here 
      public static int square(int l){
      	int sq_area = l * l;
        return sq_area;
      }
  
  	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      
      int l = in.nextInt();
      
      int area = square(l);
      System.out.println(area);
      
	}
}