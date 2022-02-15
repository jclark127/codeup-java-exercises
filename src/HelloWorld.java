import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // TODO: Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 18;
        // TODO: Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "String";
        //TODO: Change your code to assign a character value to myString. What do you notice?
        myString = "String part 2";
        //TODO: Change your code to assign the value 3.14159 to myString. What happens?
//        myString = 3.14159;
        //TODO: Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        long myNumber = 45;
        System.out.println(myNumber);
        //TODO: Change your code to assign the value 3.14 to myNumber. What do you notice?
//        myNumber = 3.14;
        //TODO: Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        myNumber = 123L;
        System.out.println(myNumber);
        //TODO: Change your code to assign the value 123 to myNumber.
        myNumber = 123;
        System.out.println(myNumber);
        //TODO: Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        double newNumber = 3.14;

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        System.out.println(three +" "+ o + "" + theNumberThree);
//        int three = (int) "three";

//        int x = 4;
//        x += 5;
//        System.out.println(x);
//
//        int x = 3;
//        int y = 4;
//        y *= x;
//
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;

        System.out.println(y);

        System.out.println(Integer.MAX_VALUE);
        int num = Integer.MAX_VALUE;
        num += num;
        System.out.println(num);
        //out of bounds
    }
}
