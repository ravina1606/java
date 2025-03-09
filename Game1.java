import java.util.Random;
import java.util.Scanner;

 class Game{
    public int number;
    public int inputnumber;
    public int noOfGuesses=0;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){

        this.noOfGuesses=noOfGuesses;
        
    }
    Game(){
        Random rand=new Random();
        this.number=rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc =new Scanner(System.in);
        inputnumber=sc.nextInt();
    }
    boolean  isCorrectNumber(){
        noOfGuesses++;
        if(inputnumber==number){
            System.out.format("yes you guess it right,it was %d",number,noOfGuesses);
            return true;
        }
        else if(inputnumber<number)
        {
            System.out.println("too low.....");
        }
        else if(inputnumber>number)
        {
            System.out.println("to high.....");
        }
        return false;
    }
 }
 public class Game1{
    public static void main(String[] args){

        Game g=new Game();
        boolean b=false;
        while (!b) {
            g.takeUserInput();
            b=g.isCorrectNumber();
            
        }

    }
   
 }





    

