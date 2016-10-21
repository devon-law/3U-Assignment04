
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lawd8918
 */
public class A4q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        //ask for speed limit
        System.out.println("Enter the speed limit.");
        int lim = input.nextInt();
        //ask for the car's speed
        System.out.println("Enter the recorded speed of the car");
        int spd = input.nextInt();

        int diff = spd - lim;
        //not speeding
        if (diff < 1) {
            System.out.println("Congratulations, you are within the speed limit.");
        }
        //over limit by 1-20 km/h
        if (diff >= 1 && diff < 21) {
            System.out.println("You are speeding and your fine is $100.");
        }
        //over limit by 21-30 km/h
        if (diff >= 21 && diff < 31) {
            System.out.println("You are speeding and your fine is $270.");
        }
        //over limit by 31+ km/h
        if (diff >= 31) {
            System.out.println("You are speeding and your fine is $500.");
        }
    }
}
