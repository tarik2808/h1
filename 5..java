import java.util.Scanner;
public class Main
{
   public static void main(String[] args) {
   Scanner reader= new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n= Integer.parseInt(reader.nextLine());


    if(n>0)
    {
      System.out.println("Number is positive "); 
    }else if (n<0)
    {
      System.out.println("Number is negative");
    }else
    {
      System.out.println("Numbers is zero");
    }
 }
}
