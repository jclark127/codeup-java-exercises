import java.sql.SQLOutput;
import java.util.*;

public class MethodsExercises {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        int a = getInteger(1, 10);
//        int b = getInteger(1, 10);
//        addition(a,b);
//        System.out.println();
//        subtraction(a,b);
//        System.out.println();
//        multiplication(a,b);
//        System.out.println();
//        division(a,b);
//        System.out.println();
//        modulus(a,b);
//        int factorialNumber = getInteger(1, 10);
//        String output = "";
//        System.out.print(factorialNumber + "! = ");
//        for(int i = 1; i <=factorialNumber; i++){
//            if(i != factorialNumber) {
//                System.out.print(i + " x ");
//            } else {
//                System.out.print(i);
//            }
//        }
//        System.out.println(" = " + factorial(factorialNumber));
        diceRoller();

    }

    public static void diceRoller() {
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("Enter the amount of sides:");
            int sides = 0;
            try {
                sides = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Input must be an integer.");
            }
            System.out.println("Dice 1 : " + (int) Math.floor(Math.random() * (sides - 1 + 1) + 1));
            System.out.println("Dice 2 : " + (int) Math.floor(Math.random() * (sides - 1 + 1) + 1));
            sc.nextLine();
            System.out.println("Continue y/n ?");
            String entry = sc.nextLine();
            if (entry.equalsIgnoreCase("n")) {
                keepGoing = false;
                System.out.println("Program Exited");
            } else if (!entry.equalsIgnoreCase("y")) {
                System.out.println("Must enter valid input. Restarting Dice Roller... ");
            }
        }
    }




    public static void addition(int a, int b) {
        System.out.println("Your numbers added:");
        System.out.println(a + b);
    }

    public static void subtraction(int a, int b) {
        System.out.println("Your numbers subtracted:");
        System.out.println(a - b);
    }

    public static void multiplication(int a, int b) {
        System.out.println("Your numbers multiplied:");
        System.out.println(a * b);
    }

    public static void division(int a, int b) {
        try {
            System.out.println("Your numbers divided:");
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }
    }

    public static void modulus(int a, int b) {
        try {
            System.out.println("The modulus of your numbers:");
            System.out.println(a % b);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }
    }

    public static int getInteger(int min, int max) {
        boolean keepGoing = true;
        int number = 0;
        while (keepGoing) {
            System.out.println("Enter a number between 1-10");
            try {
                number = Integer.parseInt(sc.nextLine());
                if (number < min || number > max) {
                    System.out.println("Not a valid entry");
                } else {
                    keepGoing = false;
                }
            } catch (Exception e) {
                System.out.println("Not a valid entry.");
            }
        }
        return number;
    }

    public static long factorial(int a) {
        if (a <= 2) {
            return a;
        }
        return a * factorial(a - 1);
    }


}
