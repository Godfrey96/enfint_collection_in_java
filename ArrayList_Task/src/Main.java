import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void displayArrayList(ArrayList<String> numbers){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your favorite numbers and type 'quit' to stop: ");

        while(in.hasNextInt()){
            numbers.add(in.nextLine());
        }
        System.out.println("\nArrayList before replacing an element: ");
        System.out.print(numbers + " ");

        System.out.print("\n\nEnter an element to remove from the ArrayList: ");
        Scanner accept = new Scanner(System.in);
        String removeElement = accept.nextLine();

        for (int i = 0; i < numbers.size(); i++){
            if(numbers.get(i).equalsIgnoreCase(removeElement)){
                System.out.print("\nEnter a new value: ");
                Scanner newValue = new Scanner(System.in);
                String replaceValue = newValue.nextLine();
                numbers.set(i, replaceValue);
            }
        }
        System.out.println("\nThe new ArrayList after adding a new value");
        System.out.println(numbers + " ");

    }

    public static void main(String[] args) {

        ArrayList<String> numbers = new ArrayList<>();

        Main m = new Main();

        m.displayArrayList(numbers);

    }
}