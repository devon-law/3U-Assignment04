
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lawd8918
 */
public class A4q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //ask user for name
        System.out.println("Please enter your name.");
        String name = input.nextLine();

        //calculate first test
        System.out.println("What was the first test out of?");
        double test1 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark1 = input.nextDouble();
        double perc1 = mark1 / test1 * 100;

        //calculate second test
        System.out.println("What was the second test out of?");
        double test2 = input.nextDouble();
        System.out.println("What mark did you get");
        double mark2 = input.nextDouble();
        double perc2 = mark2 / test2 * 100;

        //calculate third test
        System.out.println("What was the third test out of?");
        double test3 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark3 = input.nextDouble();
        double perc3 = mark3 / test3 * 100;

        //calculate fourth test
        System.out.println("What was the fourth test out of?");
        double test4 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark4 = input.nextDouble();
        double perc4 = mark4 / test4 * 100;

        //calculate fifth test
        System.out.println("What was the fifth test out of?");
        double test5 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark5 = input.nextDouble();
        double perc5 = mark5 / test5 * 100;

        //list all 5 test marks
        System.out.println("Test scores for " + name);
        System.out.println("Test 1: " + perc1 + "%");
        System.out.println("Test 2: " + perc2 + "%");
        System.out.println("Test 3: " + perc3 + "%");
        System.out.println("Test 4: " + perc4 + "%");
        System.out.println("Test 5: " + perc5 + "%");

        //calculate users average mark
        double average = (perc1 + perc2 + perc3 + perc4 + perc5) / 5;

        //display users average mark
        System.out.println("Average: " + average + "%");

    }
}
