package GUI02_home;

public class MobFighter extends Character {

    private int MagicItem;

    public MobFighter(String imie, int lvl, int attack, int defence, int health, int magicItem) {
        super(imie, lvl, attack, defence, health);
        MagicItem = magicItem;
        this.health = health + MagicItem;
    }

    @Override
    public void attack(Character c) {
        c.health = c.health-this.attack;
    }
}
