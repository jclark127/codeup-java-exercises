import java.util.*;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepGoing = true;
        String entry;
        while (keepGoing) {
            System.out.println("Say Something to Bob.");
            entry = sc.nextLine();
            if (entry.equals("")) {
                System.out.println("Fine be that way");
            } else if (entry.endsWith("?")) {
                System.out.println("Sure");
            } else if (entry.endsWith("!")) {
                System.out.println("Whoa, chill out.");
            } else {
                System.out.println("Whatever");
            }
            System.out.println("Would you like to continue y/n");
            entry = sc.nextLine();
            if (entry.equalsIgnoreCase("n")) {
                keepGoing = false;
                System.out.println("Program Exited");
            }
        }
    }
}
