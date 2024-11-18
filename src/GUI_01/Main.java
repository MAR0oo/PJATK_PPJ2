package GUI_01;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main (String args[]){

        Hero h1 = new Hero ("Jan", 50);
        Leader l1 = new Leader("Eagle", 20);
        Hero h3 =(Hero)l1;

        h1.sayHelloTo(h3);
        h3.sayHelloTo(h1);

        Squad s = new Squad("DELTA");

        s.setLeader(l1);
        try {
            s.addHero(h1);
        } catch (TooManyHeroesExceptio e) {
            e.printStackTrace();
        }

        System.out.println(s);


    }
}

class Hero{
    private String name;
    private int age;

    public Hero(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void sayHelloTo(Hero h) {
        System.out.println("Hi " + h.getName() + "!");
    }


    public String getName(){
        return name;
    }

}

class Leader extends Hero{

    public Leader(String name, int age){
        super(name, age);
    }
}

class Squad{
    private String Squadname;
    private final int MAX_HERO_CAPACITY = 0;
    private List<Hero> heros = new ArrayList<>();
    private Leader leader;

    public Squad(String Squadname){
        this.Squadname = Squadname;
    }

    public void setLeader(Leader l) {
        leader = l;
    }

    public void addHero(Hero h) throws TooManyHeroesExceptio {
        if(heros.size() < MAX_HERO_CAPACITY) {
            heros.add(h);
        } else {
            throw new TooManyHeroesExceptio();
        }
    }
    @Override
    public String toString(){
        StringBuilder heroes = new StringBuilder();
        for(Hero h:heros){
            heroes.append(h.getName());
            heroes.append(" ");
        }
        return Squadname + ", leader: " + leader.getName() + ", heroes: " + heroes.toString();
    }
}
class TooManyHeroesExceptio extends Exception {


}

