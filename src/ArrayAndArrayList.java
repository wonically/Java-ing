import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayAndArrayList {

    public static void main(String[] args) {
        //Declaring an array
        //int[] myFavNumbers = new int[5]; or
        int[] myFavNumbers = {7, 0, 12, 2, 10, 1};

        // Arrays don't support modifying a single element, so the following will yield an error:
        // myFavNumbers[0] = 1;
        // If changed, then change all.

        System.out.println("My favorite numbers are: " + Arrays.toString(myFavNumbers));
        System.out.println("My first favorite numbers are: " + myFavNumbers[0]);

        //ArrayList is a resizable array.
        //Declaring an ArrayList.
        ArrayList<Integer> myFavNumbersList = new ArrayList<>();
        //Elements in an ArrayList are Objects (which are non-primitive types), so int won't work.
        //We use Wrapper classes instead.

        //It supports adding and removing elements.
        myFavNumbersList.add(7);
        myFavNumbersList.add(0);
        myFavNumbersList.add(12);
        myFavNumbersList.add(10);
        myFavNumbersList.add(2);
        myFavNumbersList.set(2, 1);
        System.out.println("My favorite numbers are: " + Arrays.toString(myFavNumbersList.toArray()));
        System.out.println("My second favorite numbers is: " + myFavNumbers[1]);

        myFavNumbersList.remove(myFavNumbersList.size() - 2);
        System.out.println("My favorite numbers are: " + Arrays.toString(myFavNumbersList.toArray()));
        System.out.println("My third favorite number is: " + myFavNumbersList.get(2));

        Collections.sort(myFavNumbersList);
        System.out.println("I sorted my favorite numbers: " + myFavNumbersList);
    }
}
