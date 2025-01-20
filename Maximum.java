import java.util.Scanner;


public class Maximum{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the first number");
int num1=sc.nextInt();
System.out.println("Enter the first number");
int num2=sc.nextInt();
int Max=Math.max(num1,num2);
System.out.println("Maximum number is"+ Max);
}
}
