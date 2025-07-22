import java.util.*;

public class AppTracker {
    public static void main(String[] args) {
        LinkedHashSet<String> appHistory = new LinkedHashSet<>();
        appHistory.add("YouTube");
        appHistory.add("Instagram");
        appHistory.add("YouTube");
        System.out.println("Recently opened apps: " + appHistory);
        appHistory.remove("Instagram");
        System.out.println("After removing Instagram: " + appHistory);
        System.out.println("Was 'YouTube' opened? " + appHistory.contains("YouTube"));
        appHistory.clear();
        System.out.println("Is history Empty ? : "appHistory.isEmpty());
        System.out.println("Cleared all app history");
    }
}
