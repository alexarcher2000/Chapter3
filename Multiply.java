package Chapter3;


/**
 * Write a description of class Multiply here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Multiply
{
    public static void main(String[] args){
    int x = 1;
    while (x <= 12) {
        for (int i = 1; i<13; i++){
       System.out.print(i * x);
       System.out.print("   ");
      }
      x++;
      System.out.println();
    }
}
}
