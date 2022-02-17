import java.util.*;


public class HighLow {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu (){
        boolean keepGoing = true;
        System.out.println();
        System.out.println("--------------- Main Menu ---------------");
        System.out.println("1. Play Guessing Game");
        System.out.println("2. Exit the program.");
        System.out.println();
        while (keepGoing) {
            String entry = sc.nextLine();
            switch (entry) {
                case "1":
                    getRules();
                    keepGoing = false;
                    break;
                case "2":
                    keepGoing = false;
                    System.out.println("Program Exited.");
                    break;
                default:
                    System.out.println();
                    System.out.println("Please make a valid selection.");
                    System.out.println();
                    break;
            }
        }
    }


    public static void guessingGame() {
        boolean keepGoing = true;
        int rand = (int) Math.floor(Math.random() * (100 - 1 + 1) + 1);
        System.out.println(rand);
        int count = 1;
        while (keepGoing) {
            System.out.println("Guess a number between 1 - 100");
            System.out.println();
            int guess = getUserInt();
            if (count == 10) {
                System.out.println("TOO MANY GUESSES! The answer was: " + rand);
                System.out.println();
                sc.nextLine();
                keepGoing = playAgain();
            } else if (guess > rand) {
                System.out.println("LOWER");
            } else if (guess < rand) {
                System.out.println("HIGHER");
            } else if (guess == rand) {
                System.out.println("NAILED IT in " + count + " guess(es).");
                System.out.println();
                sc.nextLine();
                keepGoing = playAgain();
            }
            if (keepGoing) {
                System.out.println(10 - count + " guesses remaining.");
                count++;
            }
        }
    }

    public static void getRules() {
        System.out.println("-------------- BASIC GUESSING GAME ---------------");
        System.out.println("Rules:");
        System.out.println("1. Guess a number between 1-100");
        System.out.println("2. If your answer is too high, you will be prompted to guess a lower number.");
        System.out.println("3. If your answer is too low, you will be prompted to guess a higher number.");
        System.out.println("4. You have 10 chances to guess the correct answer. If you fail to do so, you lose");
        System.out.println();
        guessingGame();
    }


    public static int getUserInt() {
        int num = 0;
        try {
            num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Must be a valid input.");
        }
        return num;
    }

    public static boolean playAgain(){
        boolean keepGoing = true;
        while (keepGoing){
            System.out.println("Play again? y/n");
            String entry = sc.nextLine();
            if (entry.equalsIgnoreCase("y")) {
                guessingGame();
                return false;
            } else if(entry.equalsIgnoreCase("n")) {
                System.out.println("Thanks for playing!! Exiting program...");
                return false;
            } else {
                System.out.println("Not a valid entry.");
                System.out.println();
                playAgain();
                keepGoing = false;
            }
        }
        return false;
    }
}
