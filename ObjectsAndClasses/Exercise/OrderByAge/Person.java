package ProgrammingFundamentalsWithJavaMай2022.ObjectsAndClasses.Exercise.OrderByAge;

public class Person {
    private  String name;
    private  String id;
    private int age;



    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;


    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}
