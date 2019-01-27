import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    
    int num = in.nextInt();
    
   int f, m, l;
    f = num/100;
    m = ((num/10)%10);
    l = num % 10;
    
    int rev = (l*100) + (m*10) + f;
    
    System.out.println(rev);
  }
}