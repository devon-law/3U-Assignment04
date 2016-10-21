
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lawd8918
 */
public class A4q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        int player = 1;
        int dice = 1;
        while (player < 100) {
            //user enters in dice
            System.out.println("Enter sum of dice:");
                dice = input.nextInt();
            //calcualte new square
            player = player + dice;
            //snake 1
            if (player == 54) {
                player = 19;
            }
            //snake 2
            if (player == 90) {
                player = 48;
            }
            //snake 3
            if (player == 99) {
                player = 77;
            }
            //ladder 1
            if (player == 9) {
                player = 34;
            }
            //ladder 2
            if (player == 40) {
                player = 64;
            }
            //ladder 3
            if (player == 67) {
                player = 86;
            }
            //can't go over 100
            if (player > 100) {
                player = player - dice;
            }
            //how to quit the game
            if (dice == 0) {
                System.out.println("You Quit!");
                break;
            }
            //show new square
            System.out.println("You are on square " + player);
        }
        //tell user they won
        if (dice > 0 && player == 100) {
            System.out.println("You win!");
        }
    }
}
