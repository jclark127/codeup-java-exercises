import java.util.*;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        //TODO: Create an integer variable i with a value of 5.
//        int i = 5;
//        //TODO: Create a while loop that runs so long as i is less than or equal to 15
//        while (i <= 15) {
//            System.out.print(i + " ");
//            //TODO:Each loop iteration, output the current value of i, then increment i by one.
//            i++;
//        }
//        System.out.println();
//        //TODO: Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
////        int num = 0;
////        do {
////            System.out.println(num);
////            num += 2;
////        } while (num <= 100);
//        //TODO: Alter your loop to count backwards by 5's from 100 to -10.
////        int num = 105;
////        do {
////            System.out.println(num);
////            num -= 5;
////        } while (num >= -10);
//        //TODO: Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        System.out.println();
//        int num = 2;
//        do {
//            System.out.println(num);
//            num = (int) Math.pow(num, 2);
//        } while (num <= 1000000);
//        System.out.println();
//        //TODO: Create an integer variable i with a value of 5.
//        //TODO: Create a for loop that runs so long as i is less than or equal to 15
////        for (int idx = 5; idx <=15; idx++){
////            System.out.print(idx + " ");
////        }
//        System.out.println();
//        ;
//        //TODO: Create a for loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        for (int idx = 0; idx <= 100; idx += 2) {
//            System.out.println(idx);
//        }
//        System.out.println();
//        //TODO: Alter your loop to count backwards by 5's from 100 to -10.
//        for (int idx = 100; idx >= -10; idx -= 5) {
//            System.out.println(idx);
//        }
//        System.out.println();
//        //TODO: Create a for loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        for (int idx = 2; idx <= 1000000; idx = (int) Math.pow(idx, 2)) {
//            System.out.println(idx);
//        }
        //TODO: Write a program that prints the numbers from 1 to 100.
//        for (int idx = 1; idx <= 100; idx++) {
//            if (((idx % 3) == 0) && ((idx % 5) == 0)) {
//                //TODO: For numbers which are multiples of both three and five: print “FizzBuzz”.
//                System.out.println("FizzBuzz");
//            } else if ((idx % 5) == 0) {
//                //TODO: For the multiples of five: print “Buzz”.
//                System.out.println("Buzz");
//            } else if ((idx % 3) == 0) {
//                //TODO: For multiples of three: print “Fizz” instead of the number.
//                System.out.println("Fizz");
//            } else {
//                System.out.println(idx);
//            }
//        }
//
//        System.out.println("Enter an integer");
        Scanner sc = new Scanner(System.in);
//        int userInt = sc.nextInt();
//        System.out.println("Here is your table!");
//        System.out.println("Number | Squared | Cubed");
//        System.out.println("------ | ------- | -----");
//        for(int idx = 1; idx <= userInt; idx++){
//            System.out.printf("%d      | %d       | %d    %n", idx,(int)Math.pow(idx,2),(int)Math.pow(idx,3));
//        }
        boolean keepGoing = true;
        String prompt = "Enter a numerical grade between 1-100";
        System.out.println(prompt);
        String response;
        while (keepGoing) {
            int grade = sc.nextInt();
            if (grade >= 88) {
                if (grade >= 99) {
                    System.out.println("Letter grade: A+");
                } else if (grade >= 89) {
                    System.out.println("Letter Grade: A");
                } else {
                    System.out.println("letter grade: A-");
                }
            } else if (grade >= 80) {
                if (grade >= 87) {
                    System.out.println("Letter Grade: B+");
                } else if (grade >= 81) {
                    System.out.println("Letter Grade: B");
                } else {
                    System.out.println("Letter Grade: B-");
                }
            } else if (grade >= 67) {
                if (grade >= 79) {
                    System.out.println("Letter Grade: C+");
                } else if (grade >= 68) {
                    System.out.println("Letter Grade: C");
                } else {
                    System.out.println("Letter Grade: C-");
                }
            } else if (grade >= 0) {
                if (grade >= 59) {
                    System.out.println("Letter Grade: F+");
                } else if (grade >= 1) {
                    System.out.println("Letter Grade: F");
                } else {
                    System.out.println("Letter Grade: F-");
                }
            }
            System.out.println("Would you like to continue y/n");
            sc.nextLine();
            response = sc.nextLine();
            if (response.equalsIgnoreCase("n")) {
                System.out.println("Program Exited");
                keepGoing = false;
            } else if (response.equalsIgnoreCase("y")) {
                System.out.println(prompt);
            } else {
                System.out.println("Not a valid entry");
            }

        }
    }
}
