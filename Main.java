import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 80);
        Student student2 = new Student("Jane", 90);
        Student student3 = new Student("Doe", 70);
        Student student4 = new Student("Smith", 60);

        Map<String, Student> students = new HashMap<>();

        students.put(student1.getName(), student1);
        students.put(student2.getName(), student2);
        students.put(student3.getName(), student3);
        students.put(student4.getName(), student4);

        students = increaseGrade(students);

        for (Student student : students.values()) {
            System.out.println(student.getName() + " " + student.getGrade());
        }

    }

    public static Map<String, Student> increaseGrade(Map<String, Student> students) {
        for (Student student : students.values()) {
            int newGrade = (int) (student.getGrade() * 1.1);
            if(newGrade > 100) {
                newGrade = 100;
            }
            student.setGrade(newGrade);
        }
        return students;
    }

}
