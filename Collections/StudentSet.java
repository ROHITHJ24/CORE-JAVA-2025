import java.util.*;

public class StudentSet {
    public static void main(String[] args) {
        TreeSet<String> students = new TreeSet<>();
        students.add("John");
        students.add("Midhun");
        students.add("Rohith");
        System.out.println("Sorted students: " + students);
        System.out.println("First student: " + students.first());
        System.out.println("Last student: " + students.last());
        students.remove("Midhun");
        System.out.println("Contains 'Rohith'? " + students.contains("Rohith"));
        System.out.println("Descending order: " + students.descendingSet());
    }
}
