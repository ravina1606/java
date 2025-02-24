import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        
        for(int i=0;i<size;i++)
        {
            numbers[i]=sc.nextInt();
        }
        System.out.println("enter x to find");
        int x=sc.nextInt();
        for(int i=0;i<numbers.length;i++)
        {
            if(x==numbers[i])
            {
                System.out.println("x found at index "+i);
            }
        }
    }
    
}
