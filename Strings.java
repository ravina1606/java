import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // String name =sc.nextLine();
        // System.out.println("your name is :"+name);
        //cocatination
        String firstName="tony";
        String LastName="stark";
        String fullName=firstName + " "+ LastName;
        System.out.println(fullName.length());
        //charAt
        for(int i=0;i<fullName.length();i++)
        {
            System.out.println(fullName.charAt(i));
        }
        //Compare
        String name1="Tony";
        String name2="Stark";
        if(name1.compareTo(name2)==0)
        {
System.out.println("Strngs are equal");
        }
        else{
            System.out.println("strings are not equal");
        }
        String sentence="My name is Tony";
       
        String name=sentence.substring(11,sentence.length());
        System.out.println(name);
        //Strings are immutable
        }
    
}
