import java.util.*;


class ArrayListExample{
    public static void main(String[] args) {
        ArrayList <String> StudentList =new ArrayList <> ();
        StudentList.add("index 1");
        StudentList.add("index 2");
        StudentList.add("index 3");
        StudentList.add("index 4");
        StudentList.add("index 5");
        StudentList.add("index 6");
        System.out.println(StudentList);
        System.out.println(StudentList.get(1));
        System.out.println(StudentList.set(3,"Set method"));
        System.out.println(StudentList);
        System.out.println(StudentList.contains("index 1"));
  }
}