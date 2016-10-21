
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lawd8918
 */
public class A4q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //collect minutes used
        System.out.println("Number of daytime minutes?");
        double minD = input.nextDouble();
        System.out.println("Number of evening minutes?");
        double minE = input.nextDouble();
        System.out.println("Number of weekend minutes?");
        double minW = input.nextDouble();

        //plan A daytime cost
        double costAD = 0;
        if (minD >= 100) {
            costAD = (minD - 100) * 25;
        }
        
        //plan A evening and weekend costs
        double costAE = minE * 15;
        double costAW = minW * 20;
        
        //plan A total costs
        double costA = costAD + costAE + costAW;
        costA = costA / 100;
        
        //plan B daytime cost
        double costBD = 0;
        if (minD >= 250) {
            costBD = (minD - 250) * 45;
        }
        
        //plan B evening and weekend costs
        double costBE = minE * 35;
        double costBW = minW * 25;
        
        //plan B total costs
        double costB = costBD + costBE + costBW;
        costB = costB / 100;
        
        //show both plans
        System.out.println("Plan A costs $" + costA);
        System.out.println("Plan B costs $" + costB);
        
        //if B is cheaper
        if (costA > costB) {
            System.out.println("Plan B is cheaper.");
        }
        
        //if A is cheaper
        if (costA < costB) {
            System.out.println("Plan A is cheaper.");
        }
        
        //if plans are equal
        if (costA == costB) {
            System.out.println("Plan A and B are the same price.");
        }

    }
}
