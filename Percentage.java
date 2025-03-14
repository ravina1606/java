import java.util.*;
public class Percentage{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of the first subject");
        int s1=sc.nextInt();
        System.out.println("enter the marks of the second subject");
        int s2=sc.nextInt();
        System.out.println("enter the marks of the third subject");
        int s3=sc.nextInt();
        System.out.println("enter the marks of the fourth subject");
        int s4=sc.nextInt();
        System.out.println("enter the marks of the fifth subject");
        int s5=sc.nextInt();
        int sum=s1+s2+s3+s4+s5;
        float per=sum/5;
        System.out.println("percentage is:");
        System.out.println(per);
    }
    
}