package GUI_01_home;

public class Hero {
    private String name;
    private int age;
    public Hero(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void sayHelloTo(Hero h){
        System.out.println("Hello " + h.getName() + "!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
