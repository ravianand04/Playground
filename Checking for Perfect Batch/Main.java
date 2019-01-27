import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    
    int size = in.nextInt();
    
    int arr[] = new int[size];
    
    for(int i = 0; i < size; i++){
    	arr[i] = in.nextInt();	
    }
    
    correct_batch(arr, size);
  }
  
  public static void correct_batch(int arr[], int size){
  	boolean is_correct_batch = true;
    int sum_batch = arr[0] + arr[1] + arr[2];
    
    for(int i = 3; i <= (size-1); i = i+3){
    	int new_batch_sum = arr[i] + arr[i+1] + arr[i+2];
      
      if(new_batch_sum != sum_batch)
        is_correct_batch = false;
    }
    
    if(is_correct_batch == true)
      System.out.println("Perfect Batch");
    
    else
      System.out.println("Not a Perfect Batch");
    
  }
}