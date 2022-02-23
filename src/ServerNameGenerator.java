import java.sql.SQLOutput;
import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {
        String[] adjectives = {"Cheeky", "Ironic", "Spicy", "Thick", "Fancy", "Proud","Tiny","Hairy","Obscure","Festive"};
        String[] nouns = {"Gorilla", "Olympian", "Accountant", "Developer", "Mechanic", "Barista", "Bartender", "Traitor","Secretary","Pilot"};
        Random rand = new Random();
        int upper = 10;
        int rng1 = rand.nextInt(upper);
        int rng2 = rand.nextInt(upper);
        System.out.println("Your server name is:");
        System.out.println(adjectives[rng1] + "-" + nouns[rng2]);

    }
}
