package w02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Sylvia", 36, "s0678");
        Student s2 = new Student("Philip", 48, "s0002");
        Student s3 = new Student("Joe", 18, "s0042");

        Student[] students = {
                s1, s2, s3
        };

        for(Student s : students)
            System.out.println(s.getDesc());

        Arrays.sort(students);

        for(Student s : students)
            System.out.println(s.getDesc());
    }
}
