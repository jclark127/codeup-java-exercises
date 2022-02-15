import java.util. *;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);
        System.out.println("Please enter an integer.");
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        int userInt = sc.nextInt();
        System.out.printf("You entered %d%n", userInt);
        System.out.println("Enter three words");
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        sc.nextLine();
        System.out.printf("%s %s %s%n", a,b,c);
        System.out.println("Enter a sentence");
        String userSent = sc.nextLine();
        System.out.println(userSent);
        System.out.println(" ---------- ");
        System.out.println("Enter the length and width of Codeup's classroom");
//        int length = Integer.parseInt(sc.nextLine());
        int length = sc.nextInt();
//        int width = Integer.parseInt(sc.nextLine());
        int width = sc.nextInt();
        CalculateArea(length, width);
        CalculatePerimeter(length,width);
    }

    public static void CalculatePerimeter(int a, int b){
        System.out.println((a+b) *2);
    }

    public static void CalculateArea(int a, int b){
        System.out.println(a * b);

    }
}
