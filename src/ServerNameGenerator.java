
import java.util.Random;

public class ServerNameGenerator {
    public String[] adjectives;
    public String[] nouns;

    public ServerNameGenerator() {
        this.adjectives = new String[]{"Cheeky", "Ironic", "Spicy", "Thicc", "Fancy", "Proud", "Tiny", "Hairy", "Obscure", "Festive"};
        this.nouns = new String[]{"Gorilla", "Olympian", "Accountant", "Developer", "Mechanic", "Barista", "Bartender", "Traitor", "Secretary", "Pilot"};
    }

    public String getAdjective(int i) {
        return adjectives[i];
    }

    public String getNoun(int i) {
        return nouns[i];
    }

    public static void main(String[] args) {
//        String[] adjectives = {"Cheeky", "Ironic", "Spicy", "Thick", "Fancy", "Proud","Tiny","Hairy","Obscure","Festive"};
//        String[] nouns = {"Gorilla", "Olympian", "Accountant", "Developer", "Mechanic", "Barista", "Bartender", "Traitor","Secretary","Pilot"};
        Random rand = new Random();
        int upper = 10;
        int rng1 = rand.nextInt(upper);
        int rng2 = rand.nextInt(upper);
        ServerNameGenerator serverName = new ServerNameGenerator();
        System.out.println("Your server name is:");
        System.out.println(serverName.getAdjective(rng1) + "-" + serverName.getNoun(rng2));

    }
}
