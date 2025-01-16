//This pragram adds two integer numbers
//And displays their sum
import java.util.Scanner;
public class AddApplication
{
    
    
    public static void main (String [] args)
    {
        //variable declaration
        int Num1;
        int Num2;
        int Sum;
        Scanner keyboard = new Scanner(System.in);
        
        //Get input
        System.out.println("Enter the first integer number");
        Num1 = keyboard.nextInt();
        System.out.println("Enter the second integer number");
        Num2 = keyboard.nextInt();
        
        //Proccessing
        Sum = Num1 + Num2;
        
        //Display Output
        System.out.println("The sum is " + Sum);
        
    }
}