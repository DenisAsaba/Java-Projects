import java.util.Scanner;
public class DistanceProgram
{
    public static void main(String args[])
    {
        //variable declaration
        Scanner keyboard = new Scanner(System.in);
        double Speed;
        double Time;
        double Distance;
        
        //Get input
        System.out.println("Enter the speed ");
        Speed = keyboard.nextDouble();
        System.out.println("Enter the time ");
        Time = keyboard.nextDouble();
        
        //Processing
        Distance = Speed * Time;
        
        //Display output
        System.out.println("Distance = " + Distance + " miles");
    }
}