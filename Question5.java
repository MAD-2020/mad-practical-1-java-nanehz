import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
     Scanner in = new Scanner(System.in);

      System.out.println("Enter a number");
      int n = in.nextInt();
      
      int[] number_list = new int[n];
      int max = 0;
      int modevalue = 0;
      for (int i = 0; i<n; i++)
      {
        int n_2 = in.nextInt();
        number_list[i] = n_2;
        int count = 0;
        for (int j = 0; j<number_list.length;j++)
        {
          if (number_list[i] == number_list[j])
          {
            count++;
          }
          if (count > max)
          {
            max = count;
            modevalue = number_list[i];
          }
         
        
          
        }
     
        
      }
      System.out.print(modevalue);
    
  }
}
