package Chapter3;

//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay = "";  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
        int computer;         //computer's play
        Random generator = new Random();
        Scanner scan = new Scanner(System.in);
        //Get player's play -- note that this is stored as a string
        System.out.println ("Rock, Paper, or Scissors: ");
        personPlay = scan.next();
        //Make player's play uppercase for ease of comparison
        personPlay = personPlay.toUpperCase();
        //Generate computer's play (0,1,2)
        computerInt = generator.nextInt(2);
        //Translate computer's randomly generated play to string
        if (computerInt == 0){
            computerPlay = "ROCK";
        }
        if (computerInt == 1){
            computerPlay = "PAPER";
        }
        if (computerInt == 2){
            computerPlay = "SCISSORS";
        }
        //Print computer's play
        System.out.println ("Computer Picks: " + computerPlay);
        //See who won.
        if (computerPlay.equals(personPlay)){
            System.out.println ("Tie!");
        }
        if ((computerPlay.equals("ROCK") && personPlay.equals("PAPER")) || (computerPlay.equals("PAPER") && personPlay.equals("SCISSORS")) || (computerPlay.equals("SCISSORS") && personPlay.equals("ROCK"))){
            System.out.println ("You Win!");
        }
        if ((computerPlay.equals("PAPER") && personPlay.equals("ROCK")) || (computerPlay.equals("SCISSORS") && personPlay.equals("PAPER")) || (computerPlay.equals("ROCK") && personPlay.equals("SCISSORS"))){
            System.out.println ("You Lose!");
        }
    }
}