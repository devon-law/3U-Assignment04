
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lawd8918
 */
public class A4q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        
        //ask for name
        System.out.println("What is your name?");
        
        //user enters name
        String name = input.nextLine();
        
        //greet the user
        System.out.println("Hey " + name + ", how are you?");
    }
}
