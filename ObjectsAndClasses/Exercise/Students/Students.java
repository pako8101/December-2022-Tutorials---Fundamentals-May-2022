package ProgrammingFundamentalsWithJavaMай2022.ObjectsAndClasses.Exercise.Students;

public class Students {
    private  String name;
    private String lastName;
    private  double grade;

    public Students (String name, String lastName, Double grade){
        this.name = name;
        this.lastName = lastName;
        this.grade = grade;

    }

    public double getGrade() {
        return this.grade;
    }
    public String toString(){
        return String.format("%s %s: %.2f", this.name, this.lastName, this.grade);
    }
}
