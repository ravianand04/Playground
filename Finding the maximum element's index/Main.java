import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int sz = in.nextInt();
    int arr[] = new int[sz];
    int max_indx;
    
    for(int i = 0; i <= sz-1; i++){
     	arr[i] = in.nextInt(); 
    }
    
    if(arr[0] > arr[1])
      max_indx = 0;
    else
      max_indx = 1;
    
    for(int j = 2; j <= sz-1; j++){
    	if(arr[max_indx] < arr[j])
          max_indx = j;
    }
    
    System.out.println(max_indx);
  }
}