
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lawd8918
 */
public class A4q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        //define variables
        double inch = 0;
        double cm = 0;
        //ask to enter measurement
        System.out.println("Please enter a measurement in inches you wish to convert to centimetres.");
        //user enters number
        inch = input.nextDouble();
        //convert to cm
        cm = inch *2.54;
        //show the conversion
        System.out.println(inch + " inches is the same as " + cm + " centimetres");
        
        
        
    }
}
