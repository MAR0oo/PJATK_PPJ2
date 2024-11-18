package GUI_01_home;

import java.util.ArrayList;
import java.util.List;

public class Squad {


    private String Squadname;
    private List<Hero> hero= new ArrayList<>();
    private int LIMIT_LIST = 0;
    private Leader lid;

    public Squad(String sn){
        Squadname = sn;
    }

    public String getSquadname() {
        return Squadname;

    }

    public void setLeader(Leader leader){
        Leader lid = new Leader(leader.getName(), leader.getAge());
        this.lid = lid;
    }

    public void addHero(Hero h)throws TooManyHeroesExceptio {
        if (hero.size() < LIMIT_LIST) {
            hero.add(h);
        } else {
            throw new TooManyHeroesExceptio();
        }
    }


    @Override
    public String toString() {
        return  "Squadname: '" + Squadname + '\'' +
                ", leader: " + lid.getName() +
                ", heroes: " + hero.get(0).getName();
    }
}
