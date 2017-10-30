package Chapter3;


/**
 * Write a description of class Star here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Star_b
{
    public static void main (String[] args){
        final int MAX_ROWS = 10;
        for (int row = 1; row <= MAX_ROWS; row++){
            for (int star = 1; star <= row; star++){
                for (int space = (10-star); space > 0; space --){
                    System.out.print(" ");
                }
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}
