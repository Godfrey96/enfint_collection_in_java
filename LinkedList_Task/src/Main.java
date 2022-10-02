import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void receiveTwoCollection(LinkedList<String> linkedList1, LinkedList<String> linkedList2){

        // adding the first linked list
        linkedList1.add("1");
        linkedList1.add("2");
        linkedList1.add("3");
        linkedList1.add("4");
        linkedList1.add("5");

        // adding the second linked list
        linkedList2.add("6");
        linkedList2.add("7");
        linkedList2.add("8");
        linkedList2.add("9");

        System.out.print("First collection: ");
        for (String list1 : linkedList1){
            System.out.print(list1 + ",");
        }

        System.out.print("\nSecond collection: ");
        for (String list2 : linkedList2){
            System.out.print(list2 + ",");
        }

        System.out.print("\nEnter element value from the first collection: ");
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();

        // a boolean to check first collection contains an input value
        boolean checkContains = linkedList1.contains(value);
        // declare an index to get the index of the input value
        int index = linkedList1.indexOf(value);
        index++;

        // if condition the check if the input value exists in the first collection
        // if it exists then we insert the second collection from the input value
        if (checkContains){
            LinkedList<String> combineLists = new LinkedList<>();

            combineLists.addAll(linkedList1);
            combineLists.addAll(index, linkedList2);
            System.out.println("Results: " + combineLists);
        }else{
            System.out.println("Value does not exist in the first collection");
        }

    }

    public static void main(String[] args) {

        LinkedList<String> linkedList1 = new LinkedList<>();
        LinkedList<String> linkedList2 = new LinkedList<>();

        Main m = new Main();

        m.receiveTwoCollection(linkedList1, linkedList2);
    }
}