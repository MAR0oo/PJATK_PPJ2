package w02;

public
    class Student extends Person {

    protected String id;

    public Student(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

    public String getDesc() {
        return "Student: " + id;

    }

    @Override
    public int compareTo(Object o) {
        Student stud = (Student) o;
        return this.getAge() - stud.getAge();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age= '" + age + '\'' +
                "id='" + id + '\'' +
                '}';
    }


}
