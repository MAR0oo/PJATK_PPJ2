package GUI02_home;

public abstract class Character implements Comparable<Character>{
    private String imie;
    private int lvl;
    protected int attack, defence, health;

    public int compareTo(Character o) {
        if(lvl>o.lvl) return 1;
        else if(lvl<o.lvl) return -1;
        return 0;
    }

    public Character(String imie, int lvl, int attack, int defence, int health){
        this.imie = imie;
        this.lvl = lvl;
        this.attack = attack;
        this.defence = defence;
        this.health = health;
    }

    public abstract void attack(Character c);


}
