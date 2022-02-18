public class Enemy {
    public String name;
    public int health;
    public int attack;
    public int potions;


    public Enemy (String name){
        this.name = (name);
        health = 95;
        attack = 8;
        potions = 3;
    }

    public void takeDamage (int damage){
        if (damage > 20){
            System.out.print("Critical hit!! ");
        }
        System.out.println("You attacked dealing " + damage + " points of damage.");
        health -= damage;
    }

    public void usePotion() {
        health += 10;
        potions -= 1;
    }
}
