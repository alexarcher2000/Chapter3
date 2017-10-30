package Chapter3;


/**
 * Write a description of class Star here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Star_a
{
    public static void main (String[] args){
        final int MAX_ROWS = 10;
        for (int row = 1; row <= MAX_ROWS; row++){
            for (int star = 10; star >= row; star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
