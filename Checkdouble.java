import java.util.Scanner;
public class Checkdouble{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
     if(sc.hasNextDouble()&& !sc.hasNextInt())
    {
    double num1=sc.nextDouble();
    System.out.println("Enter the second number");
    if(sc.hasNextDouble()&& !sc.hasNextInt())
    {
    double num2=sc.nextDouble();
    double sum=num1+num2;
    double avg=sum/2;
    System.out.println("Average is " + avg);
    }
    }
    else{
    System.out.println("Invalid input");
    }
    }
    }