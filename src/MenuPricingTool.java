import java.util.*;
import java.text.*;

public class MenuPricingTool {


    public static Scanner sc = new Scanner (System.in);
    public static DecimalFormat df = new DecimalFormat("#.##");
    public static double desiredMarkUp = 0.22;

    public static void main(String[] args) {
        boolean keepGoing = true;
        while(keepGoing){
            mainMenu();
            int entry = getMenuEntry();
            switch (entry){
                case 1:
                    calculateMenuPrice();
                    break;
                case 2:
                    System.out.println("Desired Cost is " + getDesiredCost());
                    break;
                case 3:
                    setDesiredCost();
                    break;
                case 4:
                    keepGoing = false;
                    System.out.println("Program exited.");
                    sc.close();
                    break;
                case 5:
                    secretMenu();
                    break;
                default:
                    System.out.println("Please enter a valid selection");
                    break;
            }
        }
    }

    public static void mainMenu(){
        System.out.println("1. Calculate menu price.");
        System.out.println("2. Get desired cost.");
        System.out.println("3. Adjust desired cost %.");
        System.out.println("4. Exit the program.");

    }

    public static double getDesiredCost(){
        return desiredMarkUp;
    }

    public static void setDesiredCost(){
        System.out.println("Current desired cost is: " + desiredMarkUp);
        System.out.println("Enter new cost markup: ");
        desiredMarkUp = Double.parseDouble(sc.nextLine());
    }

    public static void calculateMenuPrice(){
        boolean keepGoing = true;
        String entry;
        while(keepGoing){
            System.out.println("Please enter unit cost:");
            double cost = getDoubleEntry();
            if (cost <=0){
                System.out.println("Invalid Entry.");
                calculateMenuPrice();
            }
            double markUp = getDesiredCost();
            double menuPrice = cost /markUp;
            System.out.println("$" + df.format(menuPrice));
            System.out.println("Would you like to continue Y/N?");
            entry = sc.nextLine();
            if (entry.equalsIgnoreCase("y")){
                keepGoing = true;
            } else if (entry.equalsIgnoreCase("n")){
                keepGoing = false;
            } else {
                System.out.println("Not a valid entry");
            }
        }
    }

    public static int getMenuEntry(){
        int entry = 0;
        try{
            entry = Integer.parseInt(sc.nextLine());
        }
        catch (Exception e){
            System.out.println("Not a valid entry.");
        }
        return entry;
    }

    public static double getDoubleEntry(){
        double entry = 0.00;
        try{
            entry = Double.parseDouble(sc.nextLine());
        }
        catch (Exception e){
            System.out.println("Not a valid entry.");
        }
        return entry;
    }

    public static void secretMenu(){
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + ". I hope you have a great day!");
        System.out.println();
    }
}
