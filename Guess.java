package Chapter3;

import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess = 1;           //Number the user tries to guess
          int guess;
          int computer;
          boolean correct;
 
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
 
          //randomly generate the  number to guess
          computer = generator.nextInt(11);
          
          //print message asking user to enter a guess
          System.out.println("Pick a Number between 1 and 10");
          guess = scan.nextInt();
          //read in guess

          while (guess != computer)  //keep going as long as the guess is wrong
            {
                  //print message saying guess is wrong
                  System.out.println("Your guess is wrong.");
                  //get another guess from the user
                  System.out.println("Pick another Number between 1 and 10");
                  guess = scan.nextInt();
                  numToGuess++;
          }
 
          //print message saying guess is right
          System.out.println("You guessed it right in " + numToGuess + " tries!");
        }
}