
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lawd8918
 */
public class A4q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ticket = 35;

        //gather expenses
        System.out.println("How much does the food for prom cost?");
        int food = input.nextInt();
        System.out.println("How much does the DJ cost?");
        int dj = input.nextInt();
        System.out.println("How much does it cost to rent the hall?");
        int hall = input.nextInt();
        System.out.println("How much does decorations cost?");
        int decor = input.nextInt();
        System.out.println("How much does it cost for staff?");
        int staff = input.nextInt();
        System.out.println("How much for miscellaneous costs?");
        int mis = input.nextInt();


        //show total
        int total = food + dj + hall + decor + staff + mis;
        System.out.println("The total cost for prom is " + total);

        //show how many tickets to sell
        int sell = (int) Math.ceil(1.0 * total / ticket);
        System.out.println("That means you must sell " + sell + " tickets to break even.");

    }
}
