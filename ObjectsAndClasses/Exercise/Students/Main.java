package ProgrammingFundamentalsWithJavaMай2022.ObjectsAndClasses.Exercise.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Students> studentList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int studentCount = 1; studentCount <=n ; studentCount++) {
            String personalData = scanner.nextLine();
            String firstName = personalData.split(" ")[0];
            String lastname = personalData.split(" ")[1];
            double grade =Double.parseDouble(personalData.split(" ")[2]);

            Students students = new Students(firstName, lastname,grade);
            studentList.add(students);
        }
        studentList.sort( Comparator.comparingDouble(Students :: getGrade).reversed());
        for (Students students: studentList) {
            System.out.println(students.toString());
        }

    }
}
