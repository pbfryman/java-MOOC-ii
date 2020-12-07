import java.util.Collections;
import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Blake"));
        students.add(new Student("Julie"));
        students.add(new Student("Olive"));
        students.add(new Student("Copper"));
        
        System.out.println(students);
        
        Collections.sort(students);
        System.out.println(students);
    }
}
