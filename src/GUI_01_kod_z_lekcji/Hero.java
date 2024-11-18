package GUI_01_kod_z_lekcji;

public class Hero {
    private String name;
    private int age;

    public Hero(String name, int age){
        this.name=name;
        this.age = age;
    }

    public void sayHelloTo(Hero h){
        System.out.println("Hi "+h.getName()+"!");
    }

    public String getName(){
        return name;
    }
}
