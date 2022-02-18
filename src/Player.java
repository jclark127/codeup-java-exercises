public class Player {
    public String name;
    public int health;
    public int attack;
    public int potions;
    public boolean flee;


    public Player(String playerName) {
        name = playerName;
        health = 100;
        attack = 20;
        potions = 5;
        flee = false;
    }


    public void usePotion() {
        health += 10;
        potions -= 1;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }
}
