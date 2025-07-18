import java.util.*;

public class PatientQueue {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("Patient A");
        queue.add("Patient B");
        queue.addFirst("Emergency Patient X");
        queue.removeFirst();
        System.out.println("Current queue: " + queue);
        System.out.println("Is 'Patient B' in queue? " + queue.contains("Patient B"));
        System.out.println("Total patients: " + queue.size());
    }
}
