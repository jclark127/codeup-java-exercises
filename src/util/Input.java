package util;

import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);

    public String getString(String prompt) {
        System.out.println(prompt);
        String str = sc.nextLine();
        return str;
    }

    public boolean yesNo(String prompt) {
        boolean trueFalse = true;
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println(prompt);
            String yorn = sc.nextLine();
            if (yorn.equalsIgnoreCase("y")) {
            keepGoing = false;
            } else if (yorn.equalsIgnoreCase("n")){
                trueFalse = false;
                keepGoing = trueFalse;
            } else {
                System.out.println("Please enter a valid response.");
            }
        }
        return trueFalse;
    }

    public int getInt(int min, int max, String prompt) {
        boolean keepGoing = true;
        int n1 = 0;
        while (keepGoing) {
            System.out.println(prompt);
            n1 = Integer.parseInt(sc.nextLine());
            if (n1 > max || n1 < min) {
                System.out.println("Please enter a valid choice");
            } else {
                keepGoing = false;
            }
        }
        return n1;
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        int n1 = Integer.parseInt(sc.nextLine());
        return n1;
    }

    public double getDouble(double min, double max, String prompt) {
        boolean keepGoing = true;
        double n1 = 0.00;
        while (keepGoing) {
            System.out.println(prompt);
            n1 = Double.parseDouble(sc.nextLine());
            if (n1 > max || n1 < min) {
                System.out.println("Please enter a valid choice");
            } else {
                keepGoing = false;
            }
        }
        return n1;
    }

    public double getDouble(String prompt) {
//        sc.nextLine();
        System.out.println(prompt);
        double n1 = Double.parseDouble(sc.nextLine());
        return n1;
    }

    public static void main(String[] args) {
        Input sc = new Input();
        System.out.println(sc.getString("Please enter a string."));
        System.out.println(sc.yesNo("Enter y or n."));
        System.out.println(sc.getInt("Enter an integer."));
        System.out.println(sc.getInt(1, 10, "Enter an integer between 1 and 10."));
        System.out.println(sc.getDouble("Enter a Double."));
        System.out.println(sc.getDouble(1.0, 10.0, "Enter a double between 1.0 and 10.0"));
    }

}
