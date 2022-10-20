import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        
        System.out.print("Type a number for a: ");
        int a= Integer.parseInt(reader.nextLine());
        
        System.out.print("Type a number for b: ");
        int b= Integer.parseInt(reader.nextLine());
        
        
        
        System.out.println("The sum is: "+(a+b));            
        
	}
}
