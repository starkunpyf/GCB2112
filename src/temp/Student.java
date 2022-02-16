package temp;

public class Student {
    private String name;
    private int age;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this(name);
        //this.Student(name);
        this.age = age;
    }
}
