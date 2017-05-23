package Java2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by micahdisney on 5/22/17.
 */
public class GradesApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Map<String, Student> students = new HashMap<>();

        Student student1 = new Student("Peter");
        student1.addGrade(87);
        student1.addGrade(89);
        student1.addGrade(98);

        Student student2 = new Student("Phil");
        student2.addGrade(99);
        student2.addGrade(77);
        student2.addGrade(98);

        Student student3 = new Student("Cory");
        student3.addGrade(99);
        student3.addGrade(99);
        student3.addGrade(96);

        Student student4 = new Student("Steve");
        student4.addGrade(77);
        student4.addGrade(79);
        student4.addGrade(64);

        students.put("peter_wiggles", student1);
        students.put("phil_buttons", student2);
        students.put("cory_williams", student3);
        students.put("steve_butters", student4);

        String yesNo;
        do {
            System.out.println("Welcome");
            System.out.println("Here are the Github usernames of our students:");

            students.forEach((username, student) -> System.out.println(" |" + username + "| "));

            System.out.println("What student would you like more info on? ");
            String username = input.next();

            if (students.get(username) == null) {
                System.out.println("Sorry, no student found with the github username of " + username);
            } else {
                Student student = students.get(username);
                System.out.println("Username: " + username);
                System.out.println("Name: " + student.getName());
                System.out.println("Average: " + student.getGradeAverage());
            }
            System.out.println("Would you like to see another student?");
            yesNo = input.next();
        } while ("y".equalsIgnoreCase(yesNo));
        System.out.println("Goodbye, and have a wonderful day!");
    }
}
