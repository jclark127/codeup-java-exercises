import java.util.*;

public class inClass218 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello " + getName());
        System.out.println("The sum of your two numbers is " + getSum());
    }

    public static String getName() {
        System.out.println("Enter your name.");
        return sc.nextLine();
    }

    public static int getSum() {
        System.out.println("Enter an integer");
        int a = sc.nextInt();
        System.out.println("Enter another integer");
        int b = sc.nextInt();
        return a + b;
    }
}
