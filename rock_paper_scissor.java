import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter o for rock,1 for paper,2 for scissor");
        int userinput=sc.nextInt();

        Random random=new Random();
        int ComputerInput=random.nextInt(3);

        if(userinput==ComputerInput){
            System.out.println("draw");

        }
        else if(userinput==00 && ComputerInput==2||userinput==1&&ComputerInput==0||userinput==2&&ComputerInput==1)
        {
            System.out.println("you win ");
        }
        else {
            System.out.println("Computer Win");
        }
        System.out.println("computer choice : "+ComputerInput);
    }
    
}
