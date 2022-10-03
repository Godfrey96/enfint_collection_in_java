import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void replaceOldToNewValue(ArrayList<String> numbers, String oldElement, String newValue) {

        try {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i).equalsIgnoreCase(oldElement)) {
                    numbers.set(i, newValue);
                }
            }
            System.out.println("\nThe new ArrayList after adding a new value");
            System.out.println(numbers + " ");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {

        ArrayList<String> numbers = new ArrayList<>();
        String oldElement = "";
        String newValue = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your favorite numbers and type 'quit' to stop: ");

        while (in.hasNextInt()) {
            numbers.add(in.nextLine());
        }
        System.out.println("\nArrayList before replacing an element: ");
        System.out.print(numbers + " ");

        // here we enter the value to be removed
        System.out.print("\n\nEnter an element to remove from the ArrayList: ");
        Scanner accept = new Scanner(System.in);
        oldElement = accept.nextLine();

        // here enter new value to replace the old value
        System.out.print("\nEnter a new value: ");
        Scanner input = new Scanner(System.in);
        newValue = input.nextLine();

        Main m = new Main();

        m.replaceOldToNewValue(numbers, oldElement, newValue);

    }
}