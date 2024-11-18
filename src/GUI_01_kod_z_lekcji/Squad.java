package GUI_01_kod_z_lekcji;
import java.util.List;
import java.util.ArrayList;

public class Squad {
    private String name;
    private final int MAX_HERO_CAPACITY=0;
    private List<Hero> heros=new ArrayList<>();
    private Leader leader;

    public Squad(String name){
        this.name=name;
    }

    public void setLeader(Leader l){
        leader=l;
    }

    public void addHero(Hero h) throws TooManyHeroesExceptio{
        if(heros.size() <MAX_HERO_CAPACITY){
            heros.add(h);
        }else{
            throw new TooManyHeroesExceptio();
        }
    }

    @Override
    public String toString(){
        StringBuilder heroes=new StringBuilder();
        for(Hero h:heros){
            heroes.append(h.getName());
            heroes.append(" ");
        }
        return name+", leader:"+leader.getName()+
                ", heroes:"+heroes.toString();
    }
}
