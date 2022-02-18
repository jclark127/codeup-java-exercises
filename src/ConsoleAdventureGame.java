import java.util.*;

public class ConsoleAdventureGame {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        startGame();
    }


    public static void startGame() {
        boolean keepGoing = true;
        while (keepGoing) {
            gamePrompt();
            System.out.println();
            System.out.println("Would you like to start the game? (yes or no)");
            String entry = sc.nextLine();
            System.out.println();
            if (entry.equalsIgnoreCase("yes")) {
                adventureGame();
                keepGoing = false;
            } else if (entry.equalsIgnoreCase("no")) {
                System.out.println("Exiting game...");
                keepGoing = false;
            }
        }
    }

    public static void gamePrompt() {
        System.out.println();
        System.out.println("                                  ---------------- Basic Adventure Game ---------------");
        System.out.println("Premise: You, a lone traveler are tasked with confronting an enemy to the likes of which have never been seen.");
    }


    public static void adventureGame() {
        boolean keepGoing = true;
        System.out.println("Please enter your name.");
        String playerName = sc.nextLine();
        Player p1 = new Player(playerName);
        System.out.println();
        Enemy enemy = new Enemy("Corrupted Rubber Ducky");
        int count = 1;
        while (keepGoing) {
            System.out.println();
            System.out.printf("----------Round %d ----------\n",  count);
            System.out.println("Player Name: " + p1.name);
            System.out.println("Health: " + p1.health);
            System.out.println(p1.health);
            System.out.println("Enemy: " + enemy.name);
            System.out.println("Health: " + enemy.health);
            userMenu();
            playerTurn(p1, enemy);
            enemyTurn(p1, enemy);
            keepGoing = keepGoing(p1, enemy);
            count ++;
        }
    }


    public static void userMenu() {
        System.out.println();
        System.out.println("------------------- Your Turn -----------------");
        System.out.println("1. Attack         2. Use Potion        3. Flee");
        System.out.println();
    }

    public static void playerTurn(Player p1, Enemy enemy) {
        String entry = sc.nextLine();
        switch (entry) {
            case "1":
                enemy.takeDamage(crit(p1.attack));
                break;
            case "2":
                if (p1.potions == 0) {
                    System.out.println("No potions available to use.");
                    userMenu();
                    playerTurn(p1, enemy);
                } else {
                    System.out.println("You used a potion and gained 10 life.");
                    p1.usePotion();
                }
                break;
            case "3":
                p1.flee = true;
                break;
            default:
                System.out.println("Please make a valid selection");
                userMenu();
                playerTurn(p1, enemy);
                break;
        }
    }

    public static void enemyTurn(Player p1, Enemy enemy) {
        if (enemy.health < 15 && enemy.potions > 0 && enemy.health > 0) {
            System.out.println("Enemy used potion and gained 10 life.");
            enemy.usePotion();
        } else if (enemy.health > 0) {
            p1.takeDamage(crit(enemy.attack));
        }
    }

    public static int crit(int damage) {
        int rand = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
        if (rand >= 7) {
            return damage + damage / 2;
        }
        return damage;
    }

    public static boolean keepGoing(Player p1, Enemy enemy) {
        if (p1.health <= 0 || enemy.health <= 0) {
            if (p1.health == 0) {
                System.out.println("You have been defeated. Better luck next time");
            } else {
                System.out.println("You have defeated the enemy, good job. Adventure over.");
            }
            return false;
        } else if (p1.flee) {
            return tryToFlee(p1,enemy);
        }
        return true;
    }

    public static boolean tryToFlee(Player p1, Enemy enemy) {
        int rand = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
        if (rand > 5) {
            System.out.println("You fled from battle. Adventure over.");
            return false;
        } else {
            System.out.println("You were unable to flee.");
            p1.flee = false;
            p1.takeDamage(crit(enemy.attack));
            return true;
        }
    }
}


