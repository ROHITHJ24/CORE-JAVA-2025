import java.util.*;

public class GroceryList {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        groceryList.add("Milk");
        groceryList.add("Bread");
        groceryList.add("Eggs");
        groceryList.add(1, "Butter");
        groceryList.set(2, "Cheese");
        groceryList.remove("Butter");
        groceryList.remove(0);
        System.out.println("Contains 'Eggs'? " + groceryList.contains("Eggs"));
        System.out.println("All items:");
        for (String item : groceryList) {
            System.out.println(item);
        }
        System.out.println("Total count: " + groceryList.size());
        Collections.sort(groceryList);
        System.out.println("Sorted items: " + groceryList);
        groceryList.clear();
        System.out.println("Cleared all items");
        System.out.println("Is list empty? " + groceryList.isEmpty());
    }
}
