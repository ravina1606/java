import java.util.Scanner;

public class bitmanipulation {
   public static void main(String[] args) {
    //get bit
//     int n=5;
//     int pos=2;
//     int bitmask=1<<pos;
    
//     if((bitmask & n)==0)
// {
//     System.out.println("bit was zero");
// }
//     else{
//         System.out.println("bit  was one");
//     }

    //set bit
    // int n=5;
    // int pos=1;
    // int bitmask=1<<pos;
    
    // int newNumber =bitmask | n;
    // System.out.println(newNumber);

    //clear
//     int n=5;
//     int pos=2;
//     int bitmask=1<<pos;
// int notbitmask= ~(bitmask);
    
//     int newNumber =notbitmask & n;
//     System.out.println(newNumber);

    //update
    Scanner sc=new Scanner(System.in);
    int oper=sc.nextInt();
    int n=5;
    int pos=1;
    int bitmask=1<<pos;
    if(oper==1)
    {
        //set oper

int newnumber=bitmask | n;
System.out.println(newnumber);
    }
else{
    int newbitmask= ~(bitmask);
    
//     int newNumber =newbitmask & n;
//     System.out.println(newNumber);
}
   }
}
