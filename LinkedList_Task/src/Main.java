import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void mergeTwoCollection(LinkedList<String> firstCollection, LinkedList<String> secondCollection,
            String elemetValue) {

        try {
            // a boolean to check first collection contains an input elemetValue
            boolean checkContains = firstCollection.contains(elemetValue);
            // declare an index to get the index of the input elemetValue
            int index = firstCollection.indexOf(elemetValue);
            index++;

            // if condition the check if the input value exists in the first collection
            // if it exists then we insert the second collection from the input value
            if (checkContains) {
                LinkedList<String> mergeCollection = new LinkedList<>();

                mergeCollection.addAll(firstCollection);
                mergeCollection.addAll(index, secondCollection);
                System.out.println("Results: " + mergeCollection);
            } else {
                System.out.println("Value does not exist in the first collection");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {

        LinkedList<String> firstCollection = new LinkedList<>();
        LinkedList<String> secondCollection = new LinkedList<>();
        String value = "";

        // adding the first collection
        firstCollection.add("1");
        firstCollection.add("2");
        firstCollection.add("3");
        firstCollection.add("4");
        firstCollection.add("5");

        // adding the second collection
        secondCollection.add("6");
        secondCollection.add("7");
        secondCollection.add("8");
        secondCollection.add("9");

        // printing the first and second collections
        System.out.println("First collection: " + firstCollection);
        System.out.println("Second collection: " + secondCollection);

        System.out.print("\nEnter a number from the first collection to insert second collection from the number: ");
        Scanner input = new Scanner(System.in);
        value = input.nextLine();

        Main m = new Main();

        m.mergeTwoCollection(firstCollection, secondCollection, value);
    }
}