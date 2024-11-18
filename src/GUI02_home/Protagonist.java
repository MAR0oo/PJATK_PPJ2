package GUI02_home;

public class Protagonist extends Character{

    private int Armor;

    public Protagonist(String imie, int lvl, int attack, int defence, int health, int armor) {
        super(imie, lvl, attack, defence, health);
        this.Armor = armor;
        this.defence = defence+Armor;
    }

    @Override
    public void attack(Character c) {
        c.defence = c.defence - c.attack/2;
        c.health = c.health - c.attack/2;
    }
}
