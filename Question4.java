import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

      System.out.println("Enter a number");
      int n = in.nextInt();
      
      int i,j,k = 1;

      for(i =1; i<=n;i++)
      {
        for(j=n;j>=i;j--){
          System.out.print('*');
          
        }
        System.out.println("");
      }
    
  }
}
