package ProgrammingFundamentalsWithJavaMай2022.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student{
        String firstName;
        String lastname;
        String age;
        String hometown;

        public Student(String firstName, String lastname,String age, String hometown){
            this.firstName = firstName;
            this.lastname = lastname;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastname() {
            return this.lastname;
        }

        public String getAge() {
            return this.age;
        }

        public String getHometown() {
            return this.hometown;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("end")){
            String[] inputStudentArr = input.split(" ");
            String firstName = inputStudentArr[0];
            String lastName = inputStudentArr[1];
            String age = inputStudentArr[2];
            String homeTown = inputStudentArr[3];

            Student currentStudent = new Student(firstName,lastName,age, homeTown);
            studentList. add(currentStudent);

            input = scanner.nextLine();
        }
        String searchTown = scanner.nextLine();
        for (Student item: studentList) {
            if (item.getHometown().equals(searchTown)){
                System.out.printf("%s %s is %s years old\n",
                item.getFirstName(),
                item.getLastname(),
                item.getAge(),item.getHometown());
            }
        }
    }
}
