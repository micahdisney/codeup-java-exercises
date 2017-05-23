package Java2;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by micahdisney on 5/22/17.
 */


public class Student {
    private String name;
    private List<Integer> grades;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }


    public String getName() {
        return name;
    }


    public void addGrade(int grade) {
        grades.add(grade);
    }


    public double getGradeAverage() {
        int sum = 0;
        for(Integer grade: grades){
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
        Student student1 = new Student("Jerry");
        student1.addGrade(90);
        student1.addGrade(95);
        student1.addGrade(100);

        System.out.println(student1.getName() + "'s average is " + student1.getGradeAverage());

        Student student2 = new Student("William");
        student2.addGrade(80);
        student2.addGrade(85);
        student2.addGrade(90);

        System.out.println(student2.getName() + "'s average is " + student2.getGradeAverage());
    }
}



